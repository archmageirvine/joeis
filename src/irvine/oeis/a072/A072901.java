package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a037.A037449;

/**
 * A072901 Composite numbers n such that the discriminant of the quadratic field Q(sqrt(n)) equals 4n.
 * @author Sean A. Irvine
 */
public class A072901 extends A002808 {

  private final DirectSequence mDisc = new A037449();

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (mDisc.a(c).equals(c.multiply(4))) {
        return c;
      }
    }
  }
}

