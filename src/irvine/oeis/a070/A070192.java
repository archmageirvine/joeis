package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a069.A069040;

/**
 * A070192 Numbers k such that k divides the numerator of B(2k) (the Bernoulli numbers), but gcd(3k, 8^k+1) &gt; 3.
 * @author Sean A. Irvine
 */
public class A070192 extends A069040 {

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      if (k.multiply(3).gcd(Z.ONE.shiftLeft(3 * k.longValueExact()).add(1)).compareTo(Z.THREE) > 0) {
        return k;
      }
    }
  }
}
