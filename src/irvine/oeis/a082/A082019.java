package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a074.A074135;

/**
 * A082019 Diagonal of square array T(n,k) with T(1,1) = 1 where antidiagonals are filled alternating upwards and downwards with the smallest number not already used such that the n-th antidiagonal sum is a multiple of n.
 * @author Sean A. Irvine
 */
public class A082019 extends A074135 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < 4 * mN - 1; ++k) {
      super.next();
    }
    return super.next();
  }
}
