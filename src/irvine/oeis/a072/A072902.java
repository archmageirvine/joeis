package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a018.A018252;
import irvine.oeis.a037.A037449;

/**
 * A072902 Nonprime numbers m such that the discriminant of the quadratic field Q(sqrt(m)) equals m.
 * @author Sean A. Irvine
 */
public class A072902 extends A018252 {

  private final DirectSequence mDisc = new A037449();

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (mDisc.a(c).equals(c)) {
        return c;
      }
    }
  }
}

