package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005450 Numerator of <code>(1+Gamma[n])/n</code>.
 * @author Sean A. Irvine
 */
public class A005450 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return new Q(mF.add(1), Z.valueOf(mN + 1)).num();
  }
}
