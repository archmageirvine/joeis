package irvine.oeis.a082;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A082174.
 * @author Sean A. Irvine
 */
public class A082180 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (Binomial.binomial(c.multiply2(), c, c).equals(Z.TWO)) {
        return c;
      }
    }
  }
}
