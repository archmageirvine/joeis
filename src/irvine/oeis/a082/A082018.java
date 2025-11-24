package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a074.A074135;

/**
 * A082018 First column of square array T(n,k) with T(1,1) = 1 where antidiagonals are filled alternating upwards and downwards with the smallest number not already used such that the n-th antidiagonal sum is a multiple of n.
 * @author Sean A. Irvine
 */
public class A082018 extends A074135 {

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
