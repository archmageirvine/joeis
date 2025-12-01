package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082229 First row of A082228.
 * @author Sean A. Irvine
 */
public class A082229 extends A082228 {

  private int mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      return super.next();
    }
    // Skip over unwanted entries
    for (int k = 1; k < 2 * mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
