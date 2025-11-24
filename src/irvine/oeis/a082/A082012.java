package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082012 First row of square array A082011.
 * @author Sean A. Irvine
 */
public class A082012 extends A082011 {

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
