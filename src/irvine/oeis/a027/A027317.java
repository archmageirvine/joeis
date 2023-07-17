package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026082;

/**
 * A027317 a(n) = Sum_{k=0..m-2} T(n,k) * T(n,k+2), where m=n for n=0,1,2,3; m=2n for n &gt;= 4; and T is given by A026082.
 * @author Sean A. Irvine
 */
public class A027317 extends A026082 {

  /** Construct the sequence. */
  public A027317() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN - 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 2)));
    }
    return sum;
  }
}
