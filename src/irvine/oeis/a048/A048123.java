package irvine.oeis.a048;

import irvine.math.z.Carmichael;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A048123 Smallest n-digit Carmichael numbers.
 * @author Sean A. Irvine
 */
public class A048123 extends Sequence3 {

  private Z mN = Z.TEN;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    Z m = mN;
    while (true) {
      if (!m.isProbablePrime() && m.mod(Carmichael.lambda(m)).equals(Z.ONE)) {
        return m;
      }
      m = m.add(1);
    }
  }
}
