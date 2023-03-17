package irvine.oeis.a039;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A039769 Composite integers k such that gcd(phi(k), k - 1) &gt; 1.
 * @author Sean A. Irvine
 */
public class A039769 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z composite = super.next();
      if (Euler.phi(composite).gcd(composite.subtract(1)).compareTo(Z.ONE) > 0) {
        return composite;
      }
    }
  }
}
