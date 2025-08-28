package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079836 First column of the triangle in which the n-th row contains n numbers with n divisors that lie between A079835(n) and A079835(n+1).
 * @author Sean A. Irvine
 */
public class A079836 extends Sequence1 {

  // After Lambert Herrgesell

  private long mN = 0;
  private Z mR = Z.TWO;

  @Override
  public Z next() {
    Z res = null;
    if (++mN == 1) {
      return Z.ONE;
    }
    long s = 0;
    final Z lim = Functions.PRIME.z(mN + 3).pow(mN);
    for (Z i = mR.add(1); i.compareTo(lim) < 0; i = i.add(1)) {
      if (Functions.SIGMA0.l(i) == mN) {
        ++s;
        if (res == null) {
          res = i;
        }
      }
      if (s == mN) {
        mR = i.add(1);
        break;
      }
    }
    return res;
  }
}

