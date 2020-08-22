package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026101 T(n,1) + T(n,2) + ... T(n,n), where T is the array in A026098.
 * @author Sean A. Irvine
 */
public class A026101 extends A026098 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
