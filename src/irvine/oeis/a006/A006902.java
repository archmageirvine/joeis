package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006902 a(n) = (2n)! * Sum_{k=0..n} (-1)^k * binomial(n,k) / (n+k)!.
 * @author Sean A. Irvine
 */
public class A006902 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Z f = Functions.FACTORIAL.z(2 * mN);
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(f).divide(Functions.FACTORIAL.z(mN + k)));
    }
    return sum;
  }
}
