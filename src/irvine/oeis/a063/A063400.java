package irvine.oeis.a063;

import irvine.math.z.Carmichael;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A063400 Largest n-digit Carmichael numbers.
 * @author Sean A. Irvine
 */
public class A063400 extends Sequence3 {

  private Z mN = Z.valueOf(100);

  @Override
  public Z next() {
    mN = mN.multiply(10);
    Z m = mN;
    while (true) {
      m = m.subtract(1);
      if (!m.isProbablePrime() && m.mod(Carmichael.lambda(m)).equals(Z.ONE)) {
        return m;
      }
    }
  }
}
