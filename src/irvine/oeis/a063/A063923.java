package irvine.oeis.a063;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063923 Numbers k such that k^5 = a^5 + b^5 + c^5 + d^5 + e^5 has a nontrivial primitive solution in nonnegative integers.
 * @author Sean A. Irvine
 */
public class A063923 extends Sequence1 {

  private long mN = 0;
  private final ArrayList<Z> mPowers = new ArrayList<>();
  private final HashSet<Z> mSet = new HashSet<>();

  private boolean is(final Z n, final int k, final int cnt, final long gcd) {
    if (cnt >= 2 && mSet.contains(n)) {
      return gcd == 1;
    }
    if (cnt >= 4) {
      return false;
    }
    for (int j = k; j < mPowers.size(); ++j) {
      final Z v = mPowers.get(j);
      final Z r = n.subtract(v);
      if (r.compareTo(v) < 0) {
        break;
      }
      if (is(r, j, cnt + 1, gcd == -1 ? j + 1 : LongUtils.gcd(gcd, j + 1))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z n5 = n.pow(5);
      mPowers.add(n5);
      mSet.add(n5);
      if (is(n.pow(5), 0, 0, -1)) {
        return n;
      }
    }
  }
}
