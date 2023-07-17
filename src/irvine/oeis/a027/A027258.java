package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a025.A025177;

/**
 * A027258 a(n) = Sum_{k=0..2n-1} T(n,k) * T(n,k+1), with T given by A025177.
 * @author Sean A. Irvine
 */
public class A027258 extends A025177 {

  /** Construct the sequence. */
  public A027258() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
