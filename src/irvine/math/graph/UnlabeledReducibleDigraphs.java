package irvine.math.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import irvine.math.MemoryFunction;
import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Equivariant region recurrences for unlabeled reducible flow graphs.
 * @author Gregory Morse
 */
public final class UnlabeledReducibleDigraphs {

  private static final List<Integer> FIXED = List.of(1);
  private static final Map<List<Integer>, Z> EMPTY = Map.of(List.of(), Z.ONE);

  static long kappa(final List<Integer> vertices, final List<Integer> blocks) {
    long orbits = 0;
    for (final int v : vertices) {
      for (final int b : blocks) {
        orbits += Functions.GCD.i(v, b);
      }
    }
    return orbits;
  }

  static Z sum(final Map<List<Integer>, Z> table) {
    Z total = Z.ZERO;
    for (final Z count : table.values()) {
      total = total.add(count);
    }
    return total;
  }

  Z content(final int length, final List<Integer> cycles) {
    final int fixed = Collections.frequency(cycles, 1);
    return fixed == 0 ? Z.ZERO : Z.valueOf(length).pow(cycles.size() - 1).multiply(fixed)
      .multiply(mRegions.getValue(PartMultisets.subtract(cycles, FIXED)));
  }

  // Assemblies without cross edges, by block cycle type.
  private final MemoryFunction<List<Integer>, Map<List<Integer>, Z>> mBlocks = new MemoryFunction<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> vertices) {
      if (vertices.isEmpty()) {
        return EMPTY;
      }
      final int largest = vertices.get(vertices.size() - 1);
      final List<Integer> rest = vertices.subList(0, vertices.size() - 1);
      final Map<List<Integer>, Z> result = new HashMap<>();
      for (int length = 1; length <= largest; ++length) {
        if (largest % length != 0) {
          continue;
        }
        final List<Integer> divisible = new ArrayList<>();
        for (final int v : rest) {
          if (v % length == 0) {
            divisible.add(v);
          }
        }
        for (final Pair<List<Integer>, Z> selection : PartMultisets.subsets(divisible)) {
          final List<Integer> cycle = new ArrayList<>();
          for (final int v : selection.left()) {
            cycle.add(v / length);
          }
          cycle.add(largest / length);
          final Z weight = selection.right().multiply(content(length, cycle));
          if (!weight.isZero()) {
            for (final Map.Entry<List<Integer>, Z> entry : getValue(PartMultisets.subtract(rest, selection.left())).entrySet()) {
              result.merge(PartMultisets.union(entry.getKey(), List.of(length)), weight.multiply(entry.getValue()), Z::add);
            }
          }
        }
      }
      return result;
    }
  };

  // Signed peeling of source block orbits.
  private final MemoryFunction<List<Integer>, Map<List<Integer>, Z>> mAcyclic = new MemoryFunction<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> vertices) {
      if (vertices.isEmpty()) {
        return EMPTY;
      }
      final Map<List<Integer>, Z> result = new HashMap<>();
      for (final Pair<List<Integer>, Z> source : PartMultisets.subsets(vertices)) {
        final List<Integer> selected = source.left();
        if (selected.isEmpty()) {
          continue;
        }
        final Map<List<Integer>, Z> rest = getValue(PartMultisets.subtract(vertices, selected));
        for (final Map.Entry<List<Integer>, Z> block : mBlocks.getValue(selected).entrySet()) {
          Z weight = source.right().multiply(block.getValue());
          if ((block.getKey().size() & 1) == 0) {
            weight = weight.negate();
          }
          for (final Map.Entry<List<Integer>, Z> entry : rest.entrySet()) {
            final Z term = weight.multiply(entry.getValue()).shiftLeft(kappa(selected, entry.getKey()));
            result.merge(PartMultisets.union(block.getKey(), entry.getKey()), term, Z::add);
          }
        }
      }
      return result;
    }
  };

  // Assemblies reachable from an entry region of cycle type root.
  private final MemoryFunction2<List<Integer>, Map<List<Integer>, Z>> mReachable = new MemoryFunction2<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> vertices, final List<Integer> root) {
      if (vertices.isEmpty()) {
        return EMPTY;
      }
      final Map<List<Integer>, Z> result = new HashMap<>();
      mAcyclic.getValue(vertices).forEach((k, count) -> result.put(k, count.shiftLeft(kappa(root, k))));
      for (final Pair<List<Integer>, Z> selection : PartMultisets.subsets(vertices)) {
        if (selection.left().size() == vertices.size()) {
          continue;
        }
        final List<Integer> rest = PartMultisets.subtract(vertices, selection.left());
        for (final Map.Entry<List<Integer>, Z> initial : get(selection.left(), root).entrySet()) {
          final Z weight = initial.getValue().multiply(selection.right()).shiftLeft(kappa(rest, initial.getKey())).negate();
          for (final Map.Entry<List<Integer>, Z> suffix : mAcyclic.getValue(rest).entrySet()) {
            result.merge(PartMultisets.union(initial.getKey(), suffix.getKey()), weight.multiply(suffix.getValue()), Z::add);
          }
        }
      }
      return result;
    }
  };

  private final MemoryFunction2<List<Integer>, Map<List<Integer>, Z>> mMarked = new MemoryFunction2<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> free, final List<Integer> marked) {
      final Map<List<Integer>, Z> result = new HashMap<>();
      for (final Map.Entry<List<Integer>, Z> a : mAcyclic.getValue(free).entrySet()) {
        for (final Map.Entry<List<Integer>, Z> b : mBlocks.getValue(marked).entrySet()) {
          Z term = a.getValue().multiply(b.getValue()).shiftLeft(kappa(free, b.getKey()));
          if ((b.getKey().size() & 1) != 0) {
            term = term.negate();
          }
          result.merge(PartMultisets.union(a.getKey(), b.getKey()), term, Z::add);
        }
      }
      return result;
    }
  };

  private final MemoryFunction2<List<Integer>, Map<List<Integer>, Z>> mMarkedReachable = new MemoryFunction2<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> free, final List<Integer> marked) {
      if (free.isEmpty() && marked.isEmpty()) {
        return EMPTY;
      }
      final Map<List<Integer>, Z> result = new HashMap<>();
      mMarked.get(free, marked).forEach((k, count) -> result.put(k, count.shiftLeft(k.size())));
      for (final Pair<List<Integer>, Z> a : PartMultisets.subsets(free)) {
        final List<Integer> rest = PartMultisets.subtract(free, a.left());
        for (final Pair<List<Integer>, Z> b : PartMultisets.subsets(marked)) {
          if (rest.isEmpty() && b.left().size() == marked.size()) {
            continue;
          }
          final Map<List<Integer>, Z> suffix = mMarked.get(rest, PartMultisets.subtract(marked, b.left()));
          final Z choose = a.right().multiply(b.right()).negate();
          for (final Map.Entry<List<Integer>, Z> first : get(a.left(), b.left()).entrySet()) {
            final Z weight = choose.multiply(first.getValue()).shiftLeft(kappa(rest, first.getKey()));
            for (final Map.Entry<List<Integer>, Z> last : suffix.entrySet()) {
              result.merge(PartMultisets.union(first.getKey(), last.getKey()), weight.multiply(last.getValue()), Z::add);
            }
          }
        }
      }
      return result;
    }
  };

  private final MemoryFunction<List<Integer>, Z> mRegions = new MemoryFunction<>() {
    @Override
    protected Z compute(final List<Integer> vertices) {
      Z total = Z.ZERO;
      for (final Pair<List<Integer>, Z> selection : PartMultisets.subsets(vertices)) {
        final List<Integer> free = PartMultisets.subtract(vertices, selection.left());
        total = total.add(selection.right().multiply(sum(mMarkedReachable.get(free, selection.left()))).shiftLeft(free.size()));
      }
      return total;
    }
  };

  // All blocks can reach a separate global sink.
  private final MemoryFunction<List<Integer>, Map<List<Integer>, Z>> mGlobalExit = new MemoryFunction<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> vertices) {
      final Map<List<Integer>, Z> result = new HashMap<>();
      mReachable.get(vertices, FIXED).forEach((k, count) -> result.put(k, count.shiftLeft(vertices.size())));
      for (final Pair<List<Integer>, Z> kept : PartMultisets.subsets(vertices)) {
        if (kept.left().size() == vertices.size()) {
          continue;
        }
        final Map<List<Integer>, Z> suffix = mReachable.get(PartMultisets.subtract(vertices, kept.left()), PartMultisets.union(FIXED, kept.left()));
        for (final Map.Entry<List<Integer>, Z> first : getValue(kept.left()).entrySet()) {
          final Z weight = first.getValue().multiply(kept.right()).negate();
          for (final Map.Entry<List<Integer>, Z> last : suffix.entrySet()) {
            result.merge(PartMultisets.union(first.getKey(), last.getKey()), weight.multiply(last.getValue()), Z::add);
          }
        }
      }
      return result;
    }
  };

  // All blocks can reach the fixed exit vertex in one block.
  private final MemoryFunction2<List<Integer>, Map<List<Integer>, Z>> mPointedExit = new MemoryFunction2<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> vertices, final List<Integer> root) {
      final Map<List<Integer>, Z> result = new HashMap<>(mReachable.get(vertices, root));
      final List<Integer> ordinary = PartMultisets.subtract(vertices, FIXED);
      for (final Pair<List<Integer>, Z> selection : PartMultisets.subsets(ordinary)) {
        if (selection.left().size() == ordinary.size()) {
          continue;
        }
        final List<Integer> kept = PartMultisets.union(FIXED, selection.left());
        final Map<List<Integer>, Z> suffix = mReachable.get(PartMultisets.subtract(vertices, kept), PartMultisets.union(root, kept));
        for (final Map.Entry<List<Integer>, Z> first : get(kept, root).entrySet()) {
          final Z weight = first.getValue().multiply(selection.right()).negate();
          for (final Map.Entry<List<Integer>, Z> last : suffix.entrySet()) {
            result.merge(PartMultisets.union(first.getKey(), last.getKey()), weight.multiply(last.getValue()), Z::add);
          }
        }
      }
      return result;
    }
  };

  static Z burnside(final int n, final int loopable, final Function<List<Integer>, Z> fixed) {
    final IntegerPartition parts = new IntegerPartition(n);
    Z count = Z.ZERO;
    int[] part;
    while ((part = parts.next()) != null) {
      final List<Integer> cycles = Arrays.stream(part).boxed().sorted().collect(Collectors.toList());
      final Z value = fixed.apply(cycles).shiftLeft(loopable < 0 ? 0 : cycles.size() + loopable);
      count = count.add(IntegerPartition.permCount(part).multiply(value));
    }
    return count.divide(Functions.FACTORIAL.z(n));
  }

  private Z rooted(final List<Integer> cycles, final boolean exit) {
    Z count = exit ? mRegions.getValue(PartMultisets.union(FIXED, cycles)) : Z.ZERO;
    for (final Pair<List<Integer>, Z> selection : PartMultisets.subsets(cycles)) {
      final List<Integer> region = selection.left();
      final List<Integer> root = PartMultisets.union(FIXED, region);
      final List<Integer> rest = PartMultisets.subtract(cycles, region);
      final Z weight = selection.right().multiply(mRegions.getValue(region));
      final Map<List<Integer>, Z> assemblies = exit ? mPointedExit.get(PartMultisets.union(FIXED, rest), root) : mReachable.get(rest, root);
      count = count.add(weight.multiply(sum(assemblies)));
    }
    return count;
  }

  /**
   * Count reducible flow graphs up to entry- and exit-preserving isomorphism.
   * @param n number of vertices
   * @param exit whether the exit is distinguished
   * @param loops whether loops are allowed
   * @return count
   */
  public Z rooted(final int n, final boolean exit, final boolean loops) {
    if (n == 1) {
      return loops ? Z.TWO : Z.ONE;
    }
    final int fixed = exit ? 2 : 1;
    return burnside(n - fixed, loops ? fixed : -1, cycles -> rooted(cycles, exit));
  }

  /**
   * Count reducible flow graphs with a global source.
   * @param n number of vertices
   * @param sink whether a global sink is required
   * @param loops whether loops are allowed
   * @return count
   */
  public Z singleSource(final int n, final boolean sink, final boolean loops) {
    if (n == 1) {
      return Z.ONE;
    }
    return sink
      ? burnside(n - 2, loops ? 0 : -1, cycles -> sum(mGlobalExit.getValue(cycles)).shiftLeft(cycles.isEmpty() ? 0 : 1))
      : burnside(n - 1, loops ? 0 : -1, cycles -> sum(mReachable.get(cycles, FIXED)));
  }

  /**
   * Count strong digraphs reducible from a distinguished entry.
   * @param n number of vertices
   * @return count
   */
  public Z strong(final int n) {
    return burnside(n - 1, -1, mRegions::getValue);
  }
}
