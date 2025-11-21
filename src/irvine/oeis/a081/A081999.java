package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081999 First row of array in A081998.
 * @author Sean A. Irvine
 */
public class A081999 extends A081998 {

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
