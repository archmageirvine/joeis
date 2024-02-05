package irvine.oeis.a068;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000364;

/**
 * A068205 Denominator of S(n)/Pi^n, where S(n) = Sum((4k+1)^(-n),k,-inf,+inf).
 * @author Sean A. Irvine
 */
public class A068205 extends Sequence1 {

  // After Jean-Fran&ccedil;ois Alcover

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private final Sequence mE = new A000364();
  private Z mF = Z.ONE;
  private int mN = 0;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      mF = mF.multiply(mN).multiply(mN - 1);
      mB.nextQ();
      return select(mB.nextQ().abs().multiply(Z.ONE.shiftLeft(mN).subtract(1)).divide(mF).divide(2));
    } else {
      return select(new Q(mE.next().abs(), mF).divide(Z.ONE.shiftLeft(mN + 1)));
    }
  }
}
