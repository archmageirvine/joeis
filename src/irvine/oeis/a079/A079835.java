package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079835 Smallest number such that there are exactly n numbers between a(n) and a(n+1) with n divisors.
 * @author Sean A. Irvine
 */
public class A079835 extends Sequence1 {

  // After Lambert Herrgesell

  private long mN = -1;
  private Z mR = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long s = 0;
    final Z lim = Functions.PRIME.z(mN + 3).pow(mN);
    for (Z i = mR.add(1); i.compareTo(lim) < 0; i = i.add(1)) {
      if (Functions.SIGMA0.l(i) == mN) {
        ++s;
      }
      if (s == mN) {
        mR = i.add(1);
        break;
      }
    }
    return mR;
  }
}

