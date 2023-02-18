package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061484 Numerator of 1/3 + 3/5 + 5/7 + ... + (2n - 1)/(2n + 1).
 * @author Sean A. Irvine
 */
public class A061484 extends Sequence0 {

  private Q mA = Q.ZERO;
  private long mN = -3;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mA = mA.add(new Q(mN, mN + 2));
    }
    return select(mA);
  }
}

