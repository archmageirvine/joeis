package irvine.oeis.a055;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055547 Number of normal n X n matrices with entries {0,1}.
 * @author Sean A. Irvine
 */
public class A055547 implements Sequence {

  // After Georg Muntingh

  // Original comment:

  // The code below computes the higher entries in these sequences quickly,
  // by recursively adding rows and columns. Rows r_i, r_j and columns
  // c_i, c_j for which the inner products <r_i, r_j> and <c_i, c_j> are
  // not equal, can then be discarded at an early stage.

  private int mN = 0;

  private int ip(final List<Integer> v1, final List<Integer> v2) {
    int sum = 0;
    for (int k = 0; k < v1.size(); ++k) {
      sum += v1.get(k) * v2.get(k);
    }
    return sum;
  }

  private boolean ips(final List<List<Integer>> lr, final List<List<Integer>> lc) {
    for (int k = 0; k < lr.size(); ++k) {
      if (ip(lr.get(k), lr.get(lr.size() - 1)) != ip(lc.get(k), lc.get(lc.size() - 1))) {
        return false;
      }
    }
    return true;
  }

  protected List<Integer> toTuple(final long state, final int n) {
    final ArrayList<Integer> a = new ArrayList<>();
    long s = state;
    for (int k = 0; k < n; ++k) {
      a.add((int) (s & 1));
      s >>>= 1;
    }
    return a;
  }

  protected long limit(final int n) {
    return 1L << n;
  }

  private Z numMat(final List<List<Integer>> ltup, final List<List<Integer>> lr, final List<List<Integer>> lc, final int n) {
    if (ips(lr, lc)) {
      final int m = lc.size();
      if (m == n) {
        return Z.ONE;
      } else {
        Z sum = Z.ZERO;
        final int q = 2 * n - 1 - 2 * m;
        for (long bits = 0; bits < limit(q); ++bits) {
          ltup.add(toTuple(bits, q));
          final List<Integer> r = new ArrayList<>();
          for (final List<Integer> t : ltup.subList(0, m)) {
            r.add(t.get(n - m - 1));
          }
          r.addAll(ltup.get(m).subList(n - m - 1, ltup.get(m).size()));
          final List<Integer> c = new ArrayList<>(ltup.get(m).subList(0, n - m));
          for (int k = 0; k < m; ++k) {
            c.add(ltup.get(m - 1 - k).get(n + 1 - m + 2 * k));
          }
          Collections.reverse(c);
          lr.add(r);
          lc.add(c);
          sum = sum.add(numMat(ltup, lr, lc, n));
          lc.remove(m);
          lr.remove(m);
          ltup.remove(m);
        }
        return sum;
      }
    }
    return Z.ZERO;
  }

  @Override
  public Z next() {
    return numMat(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), ++mN);
  }
}
