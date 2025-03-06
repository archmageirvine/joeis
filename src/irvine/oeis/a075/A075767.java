package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075767 Least m such that A(m) = -10^n, where A(n) = sigma(n) - 2n, the abundance of n.
 * @author Sean A. Irvine
 */
public class A075767 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.NEG_ONE : mN.multiply(10);
    long k = 0;
    while (true) {
      if (Functions.SIGMA1.z(++k).subtract(2 * k).equals(mN)) {
        return Z.valueOf(k);
      }
    }
  }
}
