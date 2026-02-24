package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073540 Composite numbers k such that k/phi(k) - sigma(k)/k has numerator equal to 1.
 * @author Sean A. Irvine
 */
public class A073540 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (new Q(c, Functions.PHI.z(c)).subtract(new Q(Functions.SIGMA1.z(c), c)).num().isOne()) {
        return c;
      }
    }
  }
}
