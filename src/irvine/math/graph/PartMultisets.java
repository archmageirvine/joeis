package irvine.math.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Multisets of parts in the digraph counting recurrences.
 * @author Gregory Morse
 */
final class PartMultisets {

  static <T extends Comparable<? super T>> Map<T, Integer> counts(final List<T> parts) {
    final Map<T, Integer> counts = new TreeMap<>();
    for (final T part : parts) {
      counts.merge(part, 1, Integer::sum);
    }
    return counts;
  }

  static <T extends Comparable<? super T>> List<Pair<List<T>, Z>> subsets(final List<T> parts) {
    List<Pair<List<T>, Z>> subsets = List.of(new Pair<>(List.of(), Z.ONE));
    for (final Map.Entry<T, Integer> entry : counts(parts).entrySet()) {
      final List<Pair<List<T>, Z>> next = new ArrayList<>();
      final T part = entry.getKey();
      final int count = entry.getValue();
      for (final Pair<List<T>, Z> subset : subsets) {
        for (int k = 0; k <= count; ++k) {
          final List<T> selected = new ArrayList<>(subset.left());
          selected.addAll(Collections.nCopies(k, part));
          next.add(new Pair<>(selected, subset.right().multiply(Binomial.binomial(count, k))));
        }
      }
      subsets = next;
    }
    return subsets;
  }

  static <T extends Comparable<? super T>> List<T> union(final List<T> a, final List<T> b) {
    final List<T> result = new ArrayList<>(a);
    result.addAll(b);
    Collections.sort(result);
    return result;
  }

  static <T> List<T> subtract(final List<T> a, final List<T> b) {
    final List<T> result = new ArrayList<>(a);
    for (final T k : b) {
      result.remove(k);
    }
    return result;
  }

  private PartMultisets() { }
}
