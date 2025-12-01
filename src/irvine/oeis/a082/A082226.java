package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082226 First column of array A082224.
 * @author Sean A. Irvine
 */
public class A082226 extends A082224 {

  private int mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return super.next();
    }
    // Skip over unwanted entries
    for (int k = 1; k < 2 * mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
