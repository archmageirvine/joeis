package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A006259.
 * @author Sean A. Irvine
 */
public class A006259 extends A006258 {

  // For reasons I don't understand the OEIS sequence starts with two additional 1s
  // that do not appear in Concrete Mathematics.  This prevents the fractions
  // aligning properly with A006258.

  @Override
  protected Z toZ(final Q fraction) {
    return fraction.den();
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (mN < 2) {
      ++mN;
      return Z.ONE;
    }
    return super.next();
  }
}
