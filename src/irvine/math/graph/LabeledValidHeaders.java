package irvine.math.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.MemoryFunction;
import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Inverse-contraction recurrences for the labeled valid-header counts.
 * @author Gregory Morse
 */
public final class LabeledValidHeaders {

  private static int mass(final List<Integer> weights) {
    int sum = 0;
    for (final int w : weights) {
      sum += w;
    }
    return sum;
  }

  private static Z q(final int weight) {
    return Z.ONE.shiftLeft(weight).subtract(1);
  }

  private static Z sum(final Map<Integer, Z> counts) {
    Z total = Z.ZERO;
    for (final Z count : counts.values()) {
      total = total.add(count);
    }
    return total;
  }

  private static List<Integer> state(final int a, final int b, final List<Integer> ordinary) {
    final List<Integer> weights = new ArrayList<>(List.of(a, b));
    weights.addAll(ordinary);
    return weights;
  }

  // Inverse forest on an unprotected block.
  private final MemoryFunction<List<Integer>, Map<Integer, Z>> mBlock = new MemoryFunction<>() {
    @Override
    protected Map<Integer, Z> compute(final List<Integer> weights) {
      final int n = weights.size();
      if (n == 1) {
        return Map.of(weights.get(0), Z.ONE);
      }
      final Map<Integer, Z> result = new HashMap<>();
      for (final Pair<List<Integer>, Z> selection : PartMultisets.subsets(weights)) {
        final List<Integer> kept = selection.left();
        if (kept.isEmpty()) {
          continue;
        }
        final int mass = mass(kept);
        Z qsum = Z.ZERO;
        Z roots = Z.ZERO;
        for (final int w : kept) {
          qsum = qsum.add(q(w));
          roots = roots.add(q(w).shiftLeft(mass - w));
        }
        final Z term = selection.right().multiply(qsum.pow(n - 2)).multiply(roots);
        result.merge(mass, ((n - kept.size()) & 1) == 0 ? term : term.negate(), Z::add);
      }
      return result;
    }
  };

  private final MemoryFunction<List<Integer>, Map<List<Integer>, Z>> mAssembly = new MemoryFunction<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> weights) {
      if (weights.isEmpty()) {
        return Map.of(List.of(), Z.ONE);
      }
      final List<Integer> rest = weights.subList(1, weights.size());
      final List<Integer> anchor = List.of(weights.get(0));
      final Map<List<Integer>, Z> result = new HashMap<>();
      for (final Pair<List<Integer>, Z> selection : PartMultisets.subsets(rest)) {
        final List<Integer> kept = PartMultisets.union(anchor, selection.left());
        final Map<List<Integer>, Z> suffix = getValue(PartMultisets.subtract(rest, selection.left()));
        for (final Map.Entry<Integer, Z> block : mBlock.getValue(kept).entrySet()) {
          final Z weight = selection.right().multiply(block.getValue());
          if (!weight.isZero()) {
            for (final Map.Entry<List<Integer>, Z> entry : suffix.entrySet()) {
              result.merge(PartMultisets.union(List.of(block.getKey()), entry.getKey()), weight.multiply(entry.getValue()), Z::add);
            }
          }
        }
      }
      return result;
    }
  };

  private final MemoryFunction<List<Integer>, Z> mSome = new MemoryFunction<>() {
    @Override
    protected Z compute(final List<Integer> weights) {
      final int n = weights.size();
      if (n == 1) {
        return Z.ONE;
      }
      Z total = Functions.FACTORIAL.z(n - 1);
      for (final int w : weights) {
        total = total.multiply(q(w));
      }
      if ((n & 1) == 0) {
        total = total.negate();
      }
      for (final Map.Entry<List<Integer>, Z> entry : mAssembly.getValue(weights).entrySet()) {
        final int d = n - entry.getKey().size();
        if (d > 0 && !entry.getValue().isZero()) {
          final Z term = entry.getValue().multiply(getValue(entry.getKey()));
          total = (d & 1) == 0 ? total.subtract(term) : total.add(term);
        }
      }
      return total;
    }
  };

  // Protected terminal fans, by the predecessor weight at the first root.
  private final MemoryFunction<List<Integer>, Map<Integer, Z>> mTerminal = new MemoryFunction<>() {
    @Override
    protected Map<Integer, Z> compute(final List<Integer> weights) {
      final int a = weights.get(0);
      final int b = weights.get(1);
      final List<Integer> ordinary = weights.subList(2, weights.size());
      final int r = ordinary.size();
      final Z qa = q(a);
      Z flat = qa.pow(r + 1).multiply(q(b));
      for (final int w : ordinary) {
        flat = flat.multiply(q(w));
      }
      final Map<Integer, Z> result = new HashMap<>();
      if (r == 0) {
        result.put(b, flat);
      } else {
        final Map<Integer, Integer> choices = PartMultisets.counts(ordinary);
        final Z flatPermuted = Functions.FACTORIAL.z(r - 1).multiply(flat);
        choices.forEach((p, count) -> result.put(p, flatPermuted.multiply(count)));
        for (final Map.Entry<Integer, Integer> root : choices.entrySet()) {
          final int e = root.getKey();
          final Z qe = q(e);
          final List<Integer> available = PartMultisets.subtract(ordinary, List.of(e));
          for (final Pair<List<Integer>, Z> inner : PartMultisets.subsets(available)) {
            final List<Integer> tail = PartMultisets.subtract(available, inner.left());
            final Map<Integer, Z> child = getValue(state(e, b, inner.left()));
            Z factor = qa.pow(tail.size() + 1).multiply(root.getValue()).multiply(inner.right());
            for (final int w : tail) {
              factor = factor.multiply(q(w));
            }
            final Z fromEntry = qe.multiply(sum(child));
            if (tail.isEmpty()) {
              result.merge(e, factor.multiply(fromEntry), Z::add);
              for (final Map.Entry<Integer, Z> p : child.entrySet()) {
                result.merge(p.getKey(), factor.multiply(q(p.getKey())).multiply(p.getValue()), Z::add);
              }
            } else {
              Z exits = fromEntry;
              for (final Map.Entry<Integer, Z> p : child.entrySet()) {
                exits = exits.add(q(p.getKey()).multiply(p.getValue()));
              }
              final Z term = factor.multiply(exits).multiply(Functions.FACTORIAL.z(tail.size() - 1));
              PartMultisets.counts(tail).forEach((p, count) -> result.merge(p, term.multiply(count), Z::add));
            }
          }
        }
      }
      return result;
    }
  };

  private final MemoryFunction2<List<Integer>, Map<Integer, Z>> mProtected = new MemoryFunction2<>() {
    @Override
    protected Map<Integer, Z> compute(final List<Integer> root, final List<Integer> selected) {
      final int a = root.get(0);
      if (selected.isEmpty()) {
        return Map.of(a, Z.ONE);
      }
      final Z qa = q(a);
      final Map<Integer, Z> result = new HashMap<>();
      for (final Pair<List<Integer>, Z> kept : PartMultisets.subsets(selected)) {
        final int mass = mass(kept.left());
        Z qsum = qa;
        for (final int w : kept.left()) {
          qsum = qsum.add(q(w));
        }
        final Z term = kept.right().multiply(qa).multiply(qsum.pow(selected.size() - 1)).shiftLeft(mass);
        result.merge(a + mass, ((selected.size() - kept.left().size()) & 1) == 0 ? term : term.negate(), Z::add);
      }
      return result;
    }
  };

  private final MemoryFunction<List<Integer>, Z> mTwo = new MemoryFunction<>() {
    @Override
    protected Z compute(final List<Integer> weights) {
      final int a = weights.get(0);
      final int b = weights.get(1);
      final List<Integer> ordinary = weights.subList(2, weights.size());
      final Map<List<Integer>, Z> assembly = new HashMap<>();
      for (final Pair<List<Integer>, Z> left : PartMultisets.subsets(ordinary)) {
        final List<Integer> rest = PartMultisets.subtract(ordinary, left.left());
        final Map<Integer, Z> leftBlocks = mProtected.get(List.of(a), left.left());
        for (final Pair<List<Integer>, Z> right : PartMultisets.subsets(rest)) {
          final Map<List<Integer>, Z> middle = mAssembly.getValue(PartMultisets.subtract(rest, right.left()));
          for (final Map.Entry<Integer, Z> u : leftBlocks.entrySet()) {
            for (final Map.Entry<Integer, Z> v : mProtected.get(List.of(b), right.left()).entrySet()) {
              final Z weight = left.right().multiply(right.right()).multiply(u.getValue()).multiply(v.getValue());
              if (!weight.isZero()) {
                final int x = Math.min(u.getKey(), v.getKey());
                final int y = Math.max(u.getKey(), v.getKey());
                middle.forEach((key, value) -> assembly.merge(state(x, y, key), weight.multiply(value), Z::add));
              }
            }
          }
        }
      }
      Z total = sum(mTerminal.getValue(weights));
      for (final Map.Entry<List<Integer>, Z> entry : assembly.entrySet()) {
        final int d = weights.size() - entry.getKey().size();
        if (d > 0 && !entry.getValue().isZero()) {
          final Z term = entry.getValue().multiply(getValue(entry.getKey()));
          total = (d & 1) == 0 ? total.subtract(term) : total.add(term);
        }
      }
      return total;
    }
  };

  Z some(final List<Integer> weights) {
    return mSome.getValue(weights);
  }

  Map<Integer, Z> forest(final List<Integer> weights) {
    return mBlock.getValue(weights);
  }

  /**
   * Count strong digraphs with at least one valid header.
   * @param n number of vertices
   * @return count
   */
  public Z some(final int n) {
    return some(Collections.nCopies(n, 1));
  }

  /**
   * Count strong digraphs for which two fixed vertices are valid headers.
   * @param n number of vertices
   * @return count
   */
  public Z two(final int n) {
    return mTwo.getValue(Collections.nCopies(n, 1));
  }
}
