package irvine.oeis.a002;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A002974 Number of restricted solid partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A002974 implements Sequence {

  private static final Triple<Integer> ORIGIN = new Triple<>(0, 0, 0);
  private int mN = 0;
  private Z mR = Z.ONE;

  private Map<List<Integer>, Z> mCountRsp = new HashMap<>();

  private boolean valid(final Map<Triple<Integer>, Integer> rsp, final Triple<Integer> coords, final int value) {
    if (coords.left() < 0 || coords.mid() < 0 || coords.right() < 0) {
      return true;
    }
    final Integer v = rsp.get(coords);
    return v != null && value < v;
  }

  private Set<Triple<Integer>> next(final Map<Triple<Integer>, Integer> rsp, final Triple<Integer> coords, final int value) {
    final Integer v = rsp.get(coords);
    final Set<Triple<Integer>> possible = new HashSet<>();
    if (v == null) {
      if (valid(rsp, new Triple<>(coords.left() - 1, coords.mid(), coords.right()), value)
        && valid(rsp, new Triple<>(coords.left(), coords.mid() - 1, coords.right()), value)
        && valid(rsp, new Triple<>(coords.left(), coords.mid(), coords.right() - 1), value)) {
        possible.add(coords);
      }
    } else {
      possible.addAll(next(rsp, new Triple<>(coords.left() + 1, coords.mid(), coords.right()), value));
      possible.addAll(next(rsp, new Triple<>(coords.left(), coords.mid() + 1, coords.right()), value));
      possible.addAll(next(rsp, new Triple<>(coords.left(), coords.mid(), coords.right() + 1), value));
    }
    return possible;
  }

  private final Set<Map<Triple<Integer>, Integer>> mSetRsp = new HashSet<>();

  // This is inefficient but we cache the results
  private void countRsp(final Map<Triple<Integer>, Integer> rsp, final List<Integer> pattern, final int pos, final int placed) {
    if (pos < 0) {
      mSetRsp.add(new HashMap<>(rsp));
      return;
    }
    if (placed == pattern.get(pos)) {
      countRsp(rsp, pattern, pos - 1, 0);
      return;
    }
    // Try and find a possible placements
    for (final Triple<Integer> coords : next(rsp, ORIGIN, pos)) {
      rsp.put(coords, pos);
      countRsp(rsp, pattern, pos, placed + 1);
      rsp.remove(coords);
    }
  }

  private Z rsp(final List<Integer> pattern) {
    final Z cnt = mCountRsp.get(pattern);
    if (cnt != null) {
      return cnt;
    }
    mSetRsp.clear();
    countRsp(new HashMap<>(), pattern, pattern.size() - 1, 0);
    final Z count = Z.valueOf(mSetRsp.size());
    mCountRsp.put(pattern, count);
    return count;
  }

  private List<Integer> squish(final int[] countForm) {
    final List<Integer> res = new ArrayList<>();
    for (final int c : countForm) {
      if (c != 0) {
        res.add(c);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN > 2) {
      final int n0 = (mN + 1) / 2;
      final IntegerPartition part = new IntegerPartition(mN);
      final int[] c = new int[mN + 1];
      int[] p;
      while ((p = part.next()) != null) {
        IntegerPartition.toCountForm(p, c);
        for (int k = c.length - 1; k > 1; --k) {
          if (c[k] != 0) {
            if (c[k] == 1 && k <= n0 && c[k - 1] != 0) {
              //System.out.println("n=" + mN + " " + Arrays.toString(c));
              // Found largest part k <= n0 and second largest part k - 1
              mR = mR.add(rsp(squish(c)));
            }
            break;
          }
        }
      }
    }
    return mR;
  }
}
