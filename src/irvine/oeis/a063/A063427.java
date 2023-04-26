package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A063427 a(n) is the smallest positive integer k such that n*k/(n+k) is an integer.
 * @author Sean A. Irvine
 */
public class A063427 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 1;
    while (true) {
      if (mN.multiply(++k).mod(mN.add(k)).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
