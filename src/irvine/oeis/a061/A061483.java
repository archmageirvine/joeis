package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061483 Numerator of 1 + 1/2 + 2/3 + 3/4 + ... + (n-1)/n.
 * @author Sean A. Irvine
 */
public class A061483 extends Sequence0 {

  private Q mA = Q.ONE;
  private long mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(new Q(mN, mN + 1));
    }
    return select(mA);
  }
}

