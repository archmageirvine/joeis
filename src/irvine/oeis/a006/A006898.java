package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006898 <code>a(n) = Sum_{k=0..n} C(n,k)*2^(k*(k+1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A006898 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).shiftLeft(k * (k + 1) / 2));
    }
    return sum;
  }
}
