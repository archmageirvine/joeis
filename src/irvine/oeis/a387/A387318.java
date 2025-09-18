package irvine.oeis.a387;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A387318 extends Sequence1 {

  private int mN = 0;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private void build(final List<ArrayList<Integer>> states, final int[] state, final int pos, final int sum) {
    if (pos == state.length) {
      if (sum == mN) {
        final ArrayList<Integer> lst = new ArrayList<>();
        for (final int s : state) {
          lst.add(s);
        }
        states.add(lst);
      }
      return;
    }
    for (int k = 0; k <= pos + 1 && k + sum <= mN; ++k) {
      state[pos] = k;
      build(states, state, pos + 1, sum + k);
    }
  }

  private List<ArrayList<Integer>> buildStates() {
    final ArrayList<ArrayList<Integer>> states = new ArrayList<>();
    build(states, new int[mN], 0, 0);
    return states;
  }

  protected Z select(final int label, final int[] seen) {
    return Z.valueOf(label - 1);
  }

  @Override
  public Z next() {
    ++mN;
    final List<ArrayList<Integer>> states = buildStates();
    final Map<List<Integer>, Integer> stateToIndex = new HashMap<>();
    int si = 0;
    for (final List<Integer> s : states) {
      stateToIndex.put(s, si++);
    }
    final ArrayList<Integer> id = new ArrayList<>();
    for (int k = 0; k < mN; ++k) {
      id.add(1);
    }
    final int[] seen = new int[states.size()]; // 1 + iteration numbers
    // Mark the (1, 1, 1, ...) state as achieved
    seen[stateToIndex.get(id)] = 1;
    int totalSeen = 1;
    int label = 1;
    while (totalSeen != states.size()) {
      if (mVerbose) {
        StringUtils.message("n=" + mN + " iteration " + (label - 1) + " totalSeen " + totalSeen + " / " + states.size());
      }
      ++label;
      for (int i = 0; i < states.size(); ++i) {
        if (seen[i] > 0) {
          continue; // Already solved
        }
        final ArrayList<Integer> b = states.get(i);
        for (int k = 0; k < mN; ++k) {
          for (int j = 0; j < mN; ++j) {
            if (j != k) {
              // pouring from k to j
              final int amount = Math.min(b.get(k), j + 1 - b.get(j));
              if (amount != 0) {
                final ArrayList<Integer> c = new ArrayList<>(b);
                c.set(k, c.get(k) - amount);
                c.set(j, c.get(j) + amount);
                final int l = stateToIndex.get(c);
                if (seen[l] > 0 && seen[l] < label) {
                  // From state b we can reach a previously resolved state
                  if (seen[i] == 0) {
                    // Necessary to check seen[i] because there can be more than one way to achieve the state
                    seen[i] = label;
                    ++totalSeen;
                  }
                }
              }
            }
          }
        }
      }
    }
    if (mVerbose) {
      StringUtils.message("n=" + mN + " iteration " + (label - 1) + " totalSeen " + totalSeen + " / " + states.size());
    }
    return select(label, seen);
  }
}
