package irvine.oeis.a101;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A101004 See formula line.
 * h(n_) := Sum(Binomial(n, j)^2*Binomial(2*j, j)*Sum(2/(n-i), {i, 0, j-1}), {j, 1, n}); a(n_) := n!*h(n)/4;
 * @author Georg Fischer
 */
public class A101004 extends Sequence1 {

  private int mN;
  private Z mFact;

  /** Construct the sequence. */
  public A101004() {
    mN = 0;
    mFact = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    mFact = mFact.multiply(mN);
    Q sumj = Q.ZERO;
    for (int j = 1; j <= mN; ++j) {
      Q sumi = Q.ZERO;
      for (int i = 0; i < j; ++i) {
        sumi = sumi.add(new Q(2, mN - i));
      }
      sumj = sumj.add(sumi.multiply(Binomial.binomial(mN, j).square()).multiply(Binomial.binomial(2L * j, j)));
    }
    return sumj.multiply(mFact).divide(4).num();
  }
}
