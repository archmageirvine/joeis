package irvine.oeis.a389;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A389644 Nonnegative numbers k such that for some integer m the factorial base expansion of k (without leading zeros), when read backwards, corresponds to that of m, and conversely, the factorial base expansion of m (without leading zeros), when read backwards, corresponds to that of k.
 * @author Sean A. Irvine
 */
public class A389644 extends Sequence1 {

  private long mN = -1;

  private boolean is(final ArrayList<Z> f) {
    if (!f.get(0).isOne()) {
      return false;
    }
    if (!f.get(f.size() - 1).isOne()) {
      return false;
    }
    for (int k = 1; k < f.size(); ++k) {
      if (f.get(k).compareTo(k + 1) > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0 || is(ZUtils.factorialBaseList(Z.valueOf(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
