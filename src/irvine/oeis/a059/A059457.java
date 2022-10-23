package irvine.oeis.a059;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059457 Numerator of Sum_{k=0..n} (-1)^k/(3*k+1).
 * @author Sean A. Irvine
 */
public class A059457 extends Sequence0 {

  private long mN = -1;
  private Q mSum = Q.ZERO;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mSum = mSum.signedAdd((++mN & 1) == 0, new Q(1, 3 * mN + 1));
    return select(mSum);
  }
}
