package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a081.A081998;

/**
 * A082000 First column of array in A081998.
 * @author Sean A. Irvine
 */
public class A082000 extends A081998 {

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
