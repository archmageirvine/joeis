package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082194 Main diagonal of array in A082191.
 * @author Sean A. Irvine
 */
public class A082194 extends A082191 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    // Skip over unwanted entries
    for (int k = 0; k < 4 * mN - 1; ++k) {
      super.next();
    }
    return super.next();
  }
}
