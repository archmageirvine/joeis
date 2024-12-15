package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073640 a(1) = 2; a(n) = smallest prime greater than the previous term such that concatenation of two successive terms is a prime.
 * @author Sean A. Irvine
 */
public class A073640 extends A000040 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final String s = mA.toString();
      final Z p = super.next();
      if (new Z(s + p).isProbablePrime()) {
        mA = p;
        return p;
      }
    }
  }
}
