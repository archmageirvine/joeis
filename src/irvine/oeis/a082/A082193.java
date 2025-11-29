package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082193 First column of array in A082191.
 * @author Sean A. Irvine
 */
public class A082193 extends A082191 {

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
