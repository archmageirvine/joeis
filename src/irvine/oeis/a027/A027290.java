package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026009;

/**
 * A027290 a(n) = Sum_{k=0..floor(n/2)-2} T(n,k) * T(n,k+3), with T given by A026009.
 * @author Sean A. Irvine
 */
public class A027290 extends A026009 {

  /** Construct the sequence. */
  public A027290() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN / 2 - 1; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 3)));
    }
    return sum;
  }
}
