package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006902 <code>a(n) = (2n)! *</code> Sum_{k=0..n} <code>(-1)^k *</code> binomial(n,k) <code>/ (n+k)!</code>.
 * @author Sean A. Irvine
 */
public class A006902 implements Sequence {

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Z f = mF.factorial(2 * mN);
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(f).divide(mF.factorial(mN + k)));
    }
    return sum;
  }
}
