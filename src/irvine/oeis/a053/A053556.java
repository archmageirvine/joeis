package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053556 Denominator of Sum_{k=0..n} (-1)^k/k!.
 * @author Sean A. Irvine
 */
public class A053556 implements Sequence {

  private int mN = -1;
  private Q mA = Q.ZERO;
  private Z mF = Z.ONE;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA = mA.signedAdd((mN & 1) == 0, new Q(Z.ONE, mF));
    return select(mA);
  }
}
