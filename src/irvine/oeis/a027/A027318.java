package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026082;

/**
 * A027318 a(n) = Sum_{k=0..m-3} T(n,k) * T(n,k+2), where m=n for n=0,1,2,3; m=2n for n &gt;= 4; and T is given by A026082.
 * @author Sean A. Irvine
 */
public class A027318 extends A026082 {

  /** Construct the sequence. */
  public A027318() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 3)));
    }
    return sum;
  }
}
