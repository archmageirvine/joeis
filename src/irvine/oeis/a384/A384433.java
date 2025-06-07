package irvine.oeis.a384;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A384433 Integers k that are equal to the sum of at least two of their anagrams, which must have the same number of digits as k.
 * @author Sean A. Irvine
 */
public class A384433 extends Sequence1 {

  private long mN = 953;

  private boolean is(final List<Long> lst, final long n, final long sum, final int pos) {
    if (sum >= n) {
      return sum == n;
    }
    for (int k = pos; k < lst.size(); ++k) {
      if (is(lst, n, sum + lst.get(k), k + 1)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    final Permutation perm = Permutation.permuter(Z.valueOf(n));
    final List<Long> lst = new ArrayList<>();
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        final long t = Permutation.permToZ(p).longValueExact();
        if (t < n) {
          lst.add(t);
        }
      }
    }
    return is(lst, n, 0, 0);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
