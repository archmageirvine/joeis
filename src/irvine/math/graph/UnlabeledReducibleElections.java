package irvine.math.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Equivariant SCC assemblies for the unlabeled election counts.
 * @author Gregory Morse
 */
public final class UnlabeledReducibleElections {

  private final UnlabeledReducibleDigraphs mRegions = new UnlabeledReducibleDigraphs();
  private final Function<List<Integer>, Z> mSource;

  /**
   * Construct the election recurrence.
   * @param every whether every election must be reducible
   */
  public UnlabeledReducibleElections(final boolean every) {
    mSource = every ? new AllValidCycleIndex()::fixed : new SomeValidOrbitCounts()::fixed;
  }

  // Signed source block orbits, retaining only unmarked types.
  private final MemoryFunction<List<Integer>, Map<List<Integer>, Z>> mBlocks = new MemoryFunction<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> vertices) {
      if (vertices.isEmpty()) {
        return Map.of(List.of(), Z.NEG_ONE);
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
          final Z ordinary = mRegions.content(length, cycle);
          final Z marked = Z.valueOf(length).pow(cycle.size() - 1).multiply(mSource.apply(cycle)).subtract(ordinary);
          if (ordinary.isZero() && marked.isZero()) {
            continue;
          }
          for (final Map.Entry<List<Integer>, Z> entry : getValue(PartMultisets.subtract(rest, selection.left())).entrySet()) {
            final Z weight = selection.right().multiply(entry.getValue()).negate();
            if (!ordinary.isZero()) {
              result.merge(PartMultisets.union(entry.getKey(), List.of(length)), weight.multiply(ordinary), Z::add);
            }
            if (!marked.isZero()) {
              result.merge(entry.getKey(), weight.multiply(marked), Z::add);
            }
          }
        }
      }
      result.values().removeIf(Z::isZero);
      return result;
    }
  };

  private final MemoryFunction<List<Integer>, Map<List<Integer>, Z>> mAcyclic = new MemoryFunction<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final List<Integer> vertices) {
      if (vertices.isEmpty()) {
        return Map.of(List.of(), Z.ONE);
      }
      final Map<List<Integer>, Z> result = new HashMap<>();
      for (final Pair<List<Integer>, Z> selection : PartMultisets.subsets(vertices)) {
        if (selection.left().isEmpty()) {
          continue;
        }
        final Map<List<Integer>, Z> suffixes = getValue(PartMultisets.subtract(vertices, selection.left()));
        for (final Map.Entry<List<Integer>, Z> first : mBlocks.getValue(selection.left()).entrySet()) {
          final Z weight = selection.right().multiply(first.getValue());
          for (final Map.Entry<List<Integer>, Z> rest : suffixes.entrySet()) {
            final Z term = weight.multiply(rest.getValue()).shiftLeft(UnlabeledReducibleDigraphs.kappa(selection.left(), rest.getKey()));
            result.merge(PartMultisets.union(first.getKey(), rest.getKey()), term, Z::add);
          }
        }
      }
      result.values().removeIf(Z::isZero);
      return result;
    }
  };

  /**
   * Count digraphs reducible in the specified election mode.
   * @param n number of vertices
   * @param loops whether loops are allowed
   * @return count
   */
  public Z count(final int n, final boolean loops) {
    return UnlabeledReducibleDigraphs.burnside(n, loops ? 0 : -1, p -> UnlabeledReducibleDigraphs.sum(mAcyclic.getValue(p)));
  }

  private final AllValidCycleIndex mAllValid = new AllValidCycleIndex();

  /**
   * Count unlabeled strong digraphs reducible from every entry.
   * @param n number of vertices
   * @return count
   */
  public Z strong(final int n) {
    return UnlabeledReducibleDigraphs.burnside(n, -1, mAllValid::fixed);
  }
}
