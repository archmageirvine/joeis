package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082198 First column of triangle in A082196.
 * @author Sean A. Irvine
 */
public class A082198 extends A082196 {

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
