package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082197 Diagonal of triangle in A082196.
 * @author Sean A. Irvine
 */
public class A082197 extends A082196 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    // Skip over unwanted entries
    for (int k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
