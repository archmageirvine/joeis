package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053518 Numerators of successive convergents to continued fraction 1+2/(3+3/(4+4/(5+5/(6+6/(7+7/(8+8/(9+9/10+...))))))).
 * @author Sean A. Irvine
 */
public class A053518 implements Sequence {

  private Z mH0 = Z.ONE;
  private Z mK0 = Z.ONE;
  private Z mH1 = Z.FIVE;
  private Z mK1 = Z.THREE;
  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return select(mN == 0 ? new Q(mH0, mK0) : new Q(mH1, mK1));
    }
    final Z h = mH1.multiply(mN + 2).add(mH0.multiply(mN + 1));
    final Z k = mK1.multiply(mN + 2).add(mK0.multiply(mN + 1));
    mH0 = mH1;
    mK0 = mK1;
    mH1 = h;
    mK1 = k;
    return select(new Q(mH1, mK1));
  }
}
