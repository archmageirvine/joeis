package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072875 Smallest start for a run of n consecutive numbers of which the i-th has exactly i prime factors.
 * @author Sean A. Irvine
 */
public class A072875 extends A000040 {

  private Z mP = super.next();
  private int mN = 0;

  private boolean is(final Z p, final int n) {
    for (int k = 1; k < n; ++k) {
      if (Functions.BIG_OMEGA.l(p.add(k)) != k + 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mP, mN)) {
        return mP;
      }
      mP = super.next();
    }
  }
}

