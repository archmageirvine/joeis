package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a007.A007419;

/**
 * A025524 Number of positive integers that are not the sum of distinct <code>n-th-order</code> polygonal numbers.
 * @author Sean A. Irvine
 */
public class A025524 extends A007419 {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    final long upper = super.next().longValueExact();
    long c = 0;
    for (long k = 1; k <= upper; ++k) {
      if (!isSum(mN, k)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
