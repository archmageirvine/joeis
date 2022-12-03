package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060592 Square table by antidiagonals of minimum number of moves between two positions in the Tower of Hanoi (with three pegs: 0,1,2), where with position n written in base 3, xyz means smallest disk is on peg z, second smallest is on peg y, third smallest on peg x, etc. and leading zeros indicate largest disks are all on peg 0.
 * @author Sean A. Irvine
 */
public class A060592 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private int valuation(long code) {
    int cnt = 0;
    while (code != 0) {
      ++cnt;
      code /= 3;
    }
    return cnt;
  }

  private List<LinkedList<Integer>> decode(long code, final long maxDisk) {
    final List<LinkedList<Integer>> res = new ArrayList<>();
    for (int k = 0; k < 3; ++k) {
      res.add(new LinkedList<>());
    }
    int disk = 0;
    while (code != 0) {
      res.get((int) (code % 3)).add(++disk);
      code /= 3;
    }
    while (disk < maxDisk) {
      res.get(0).add(++disk);
    }
    return res;
  }

  private List<LinkedList<Integer>> deepCopy(final List<LinkedList<Integer>> state) {
    final List<LinkedList<Integer>> newState = new ArrayList<>(state.size());
    for (final List<Integer> t : state) {
      newState.add(new LinkedList<>(t));
    }
    return newState;
  }

  private long t(final long a, final long b) {
    if (a == b) {
      return 0; // efficiency
    }
    final int maxDisk = Math.max(valuation(a), valuation(b));
    final List<LinkedList<Integer>> sa = decode(a, maxDisk);
    final List<LinkedList<Integer>> sb = decode(b, maxDisk);
    final HashMap<List<LinkedList<Integer>>, Integer> seen = new HashMap<>();
    seen.put(sa, 0);
    final LinkedList<List<LinkedList<Integer>>> queue = new LinkedList<>();
    queue.add(sa);
    // breadth first search
    while (true) {
      final List<LinkedList<Integer>> state = queue.pollFirst();
      final int level = seen.get(state);
      for (int k = 0; k < 3; ++k) {
        if (!state.get(k).isEmpty()) {
          for (int j = 0; j < 3; ++j) {
            if (j != k && (state.get(j).isEmpty() || state.get(k).peekFirst() < state.get(j).peekFirst())) {
              // Move from k to j
              final List<LinkedList<Integer>> newState = deepCopy(state);
              newState.get(j).addFirst(newState.get(k).pollFirst());
              if (newState.equals(sb)) {
                return level + 1;
              }
              if (!seen.containsKey(newState)) {
                seen.put(newState, level + 1);
                queue.add(newState);
              }
            }
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mM, mN - mM));
  }
}
