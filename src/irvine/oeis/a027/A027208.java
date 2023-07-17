package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026725;

/**
 * A027208 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1), with T given by A026725.
 * @author Sean A. Irvine
 */
public class A027208 extends A026725 {

  /** Construct the sequence. */
  public A027208() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
