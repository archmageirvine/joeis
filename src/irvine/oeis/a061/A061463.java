package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061463 Numerator of 1 + 1/(2^2) + 1/(3^3) + ... 1/(n^n).
 * @author Sean A. Irvine
 */
public class A061463 extends Sequence0 {

  private Q mA = Q.ZERO;
  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(new Q(Z.ONE, Z.valueOf(mN).pow(mN)));
    }
    return select(mA);
  }
}

