package irvine.oeis.a046;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046989 Denominators of Taylor series expansion in powers of x^2 of log(x/sin x).
 * @author Sean A. Irvine
 */
public class A046989 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = -1;
  private Z mF = Z.ONE;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return select(Q.ZERO);
    }
    mF = mF.multiply(2L * mN).multiply(2L * mN - 1);
    mB.nextQ();
    final Q b = mB.nextQ();
    final Z s = Z.ONE.shiftLeft(2L * mN - 1);
    final Q t = b.multiply(s).divide(mF).divide(mN);
    return select(t);
  }
}
