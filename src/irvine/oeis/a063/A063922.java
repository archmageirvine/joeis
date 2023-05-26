package irvine.oeis.a063;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063917.
 * @author Sean A. Irvine
 */
public class A063922 extends Sequence1 {

  private long mN = 0;
  private final ArrayList<Z> mPowers = new ArrayList<>();
  private final HashSet<Z> mSet = new HashSet<>();

  private boolean is(final Z n, final int k, final int cnt) {
    if (cnt >= 2 && mSet.contains(n)) {
      return true;
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
      if (is(r, j, cnt + 1)) {
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
      if (is(n.pow(5), 0, 0)) {
        return n;
      }
    }
  }
}
