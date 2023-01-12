package irvine.oeis.a355;
// manually andiv 

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A355372 Expansion of the e.g.f. log((1 - x) / (1 - 2*x)) / (1 - x)^3.
 * @author Georg Fischer
 */
public class A355372 extends AbstractSequence {

  private int mN;

  /** Construct the sequence. */
  public A355372() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    // a(0) = 0, a(n) = n!*Sum_{k=1..n} (n-k+2)*(n-k+1)*(2^k-1)/(2*k).
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    Q sum = Q.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(new Q(Z.ONE.shiftLeft(k).subtract(1).multiply(mN - k + 2).multiply(mN - k + 1),
        Z.valueOf(2 * k)));
    }
    return sum.multiply(MemoryFactorial.SINGLETON.factorial(mN)).num();
  }
}
