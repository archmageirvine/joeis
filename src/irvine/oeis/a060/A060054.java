package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A060054 Numerators of numbers appearing in the Euler-Maclaurin summation formula.
 * @author Sean A. Irvine
 */
public class A060054 extends AbstractSequence {

  /* Construct the sequence. */
  public A060054() {
    super(1);
  }

  protected int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    Z kf = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      if (k > 1) {
        kf = kf.multiply(k);
      }
      final Q t = new Q(kf.multiply(Stirling.secondKind(mN, k)), Z.ONE.shiftLeft(k + 1));
      sum = sum.signedAdd((k & 1) == 1, t);
    }
    return select(sum.divide(Z.ONE.shiftLeft(mN + 1).subtract(1)));
  }
}
