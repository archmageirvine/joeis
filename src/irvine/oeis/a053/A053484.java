package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053484 Numerators in expansion of exp(2x)/(1-x).
 * @author Sean A. Irvine
 */
public class A053484 implements Sequence {

  private Q mA = Q.ZERO;
  private Z mF = Z.ONE;
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA = mA.add(new Q(Z.ONE.shiftLeft(mN), mF));
    return select(mA);
  }
}

