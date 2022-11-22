package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060448.
 * @author Sean A. Irvine
 */
public class A060463 extends Sequence1 {

  private int mN = -1;

  private boolean isSmashable(final Map<List<Integer>, Integer> partitionToIndex, final List<Integer> state, final boolean[] seen) {
    // Fair shares
    for (int k = 2; k <= state.size(); ++k) {
      if (state.get(k - 1) > 0) {
        for (int j = 2; j <= k; ++j) {
          if (k % j == 0) {
            // k can be split evenly into j piles of size k / j
            final ArrayList<Integer> s = new ArrayList<>(state);
            s.set(k - 1, state.get(k - 1) - 1); // remove one pile of size k
            final int t = k / j - 1;
            s.set(t, state.get(t) + j); // add j piles of size k / j
            if (!seen[partitionToIndex.get(s)]) {
              return false;
            }
          }
        }
      }
    }
    // Varied pairs
    for (int k = 1; k <= state.size(); ++k) {
      if (state.get(k - 1) > 0) {
        for (int j = k + 1; j <= state.size(); ++j) {
          if (state.get(j - 1) > 0) {
            final ArrayList<Integer> s = new ArrayList<>(state);
            final int i = k + j - 1;
            s.set(i, state.get(i) + 1);
            s.set(k - 1, state.get(k - 1) - 1);
            s.set(j - 1, state.get(j - 1) - 1);
            if (!seen[partitionToIndex.get(s)]) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN <= 10) {
      return Z.ZERO;
    }
    // Possible states are the partitions of mN.
    // We work with the partitions in count form (i.e., k1*1 + k2*2 + ... + kn * n).
    final Map<List<Integer>, Integer> partitionToIndex = new HashMap<>();
    int[] p;
    final int[] c = new int[mN + 1];
    final IntegerPartition part = new IntegerPartition(mN);
    int partNum = -1;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      final ArrayList<Integer> countForm = new ArrayList<>(mN);
      for (int k = 1; k < c.length; ++k) { // position 0 of c is unused
        countForm.add(c[k]);
      }
      partitionToIndex.put(countForm, ++partNum);
    }
    // Invert the map
    @SuppressWarnings("unchecked")
    final List<Integer>[] indexToPartition = (List<Integer>[]) new List<?>[partitionToIndex.size()];
    for (final Map.Entry<List<Integer>, Integer> e : partitionToIndex.entrySet()) {
      indexToPartition[e.getValue()] = e.getKey();
    }
    // Set up remoteness-0, P-position
    final boolean[] seen = new boolean[partitionToIndex.size()];
    final List<Integer> terminal = new ArrayList<>();
    terminal.add(mN); // mN * 1
    for (int k = 2; k <= mN; ++k) {
      terminal.add(0);
    }
    final int tIndex = partitionToIndex.get(terminal);
    seen[tIndex] = true;
    Set<Integer> pPositions = Collections.singleton(tIndex);
    while (true) {
      // Compute next set of remoteness N-positions
      final Set<Integer> nPositions = new HashSet<>();
      for (final int state : pPositions) {
        // Find every possible state that can lead to this state
        final List<Integer> counts = indexToPartition[state];
        for (int k = 1; k <= counts.size(); ++k) {
          final int j = counts.get(k - 1);
          for (int i = 2; i <= j; ++i) {
            // combine i piles of size k
            final ArrayList<Integer> s = new ArrayList<>(counts);
            s.set(k - 1, counts.get(k - 1) - i);
            final int t = i * k - 1;
            s.set(t, counts.get(t) + 1);
            nPositions.add(partitionToIndex.get(s));
          }
        }
        for (int k = 3; k <= counts.size(); ++k) {
          // split a pile of size k into smaller piles of different size
          if (counts.get(k - 1) > 0) {
            for (int j = 1; 2 * j < k; ++j) {
              final int i = k - j; // split k = j + i, j != i
              final ArrayList<Integer> s = new ArrayList<>(counts);
              s.set(k - 1, counts.get(k - 1) - 1);
              s.set(j - 1, counts.get(j - 1) + 1);
              s.set(i - 1, counts.get(i - 1) + 1);
              nPositions.add(partitionToIndex.get(s));
            }
          }
        }
      }
      for (final int v : nPositions) {
        seen[v] = true;
      }
//      System.out.println("N-positions:");
//      for (final int v : nPositions) {
//        System.out.print(indexToPartition[v] + " ");
//      }
//      System.out.println();
      if (nPositions.isEmpty()) {
        break;
      }
      pPositions = new HashSet<>();
      for (int k = 0; k < seen.length; ++k) {
        if (!seen[k]) {
          final List<Integer> state = indexToPartition[k];
          if (isSmashable(partitionToIndex, state, seen)) {
            pPositions.add(k);
          }
        }
      }
      for (final int v : pPositions) {
        seen[v] = true;
      }
//      System.out.println("P-positions:");
//      for (final int v : pPositions) {
//        System.out.print(indexToPartition[v] + " ");
//      }
//      System.out.println();
      if (pPositions.isEmpty()) {
        break;
      }
    }
    long cnt = 0;
    for (final boolean v : seen) {
      if (!v) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

}
