package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026703;

/**
 * A027255 Sum_{k=0..n-3} T(n,k) * T(n,k+3), with T given by A026703.
 * @author Sean A. Irvine
 */
public class A027255 extends A026703 {

  /** Construct the sequence. */
  public A027255() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 3)));
    }
    return sum;
  }
}
