package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082230 First column of A082228.
 * @author Sean A. Irvine
 */
public class A082230 extends A082228 {

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
