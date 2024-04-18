package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A069068 Composite numbers k+1 such that k*phi(k+1) is a perfect square.
 * @author Sean A. Irvine
 */
public class A069068 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z c1 = c.subtract(1);
      if (Functions.PHI.z(c).multiply(c1).isSquare()) {
        return c1;
      }
    }
  }
}

