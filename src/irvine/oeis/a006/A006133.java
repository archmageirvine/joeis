package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003231;
import irvine.oeis.a003.A003234;

/**
 * A006133.
 * @author Sean A. Irvine
 */
public class A006133 extends A003231 {

  private final A003234 mOther = new A003234();

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.equals(mOther.next())) {
        return a;
      }
    }
  }
}
