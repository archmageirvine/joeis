package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082202 First column of the triangle described in A082200.
 * @author Sean A. Irvine
 */
public class A082202 extends A082200 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z res = super.next();
    // Skip over unwanted entries
    for (int k = 0; k < mN; ++k) {
      super.next();
    }
    return res;
  }
}
