package irvine.oeis.a343;
// manually 2021-06-21

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A343523 a(0) = 1; a(n) = 2 * Sum_{k=1..n} binomial(n,k) * a(k-1).
 * @author Georg Fischer
 */
public class A343523 extends MemorySequence {
    
  protected int mN = -1; // current index
  
  @Override
  public Z computeNext() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(a(k - 1)));
    }
    return sum.multiply2();
  }
}
