package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082201 Last terms in the rows (main diagonal) of the triangle described in A082200.
 * @author Sean A. Irvine
 */
public class A082201 extends A082200 {

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
