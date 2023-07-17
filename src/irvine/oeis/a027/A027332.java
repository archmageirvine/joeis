package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026148;

/**
 * A027332 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+3), with T given by A026148.
 * @author Sean A. Irvine
 */
public class A027332 extends A026148 {

  /** Construct the sequence. */
  public A027332() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 3)));
    }
    return sum;
  }
}
