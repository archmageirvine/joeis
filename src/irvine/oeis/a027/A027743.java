package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027743.
 * @author Sean A. Irvine
 */
public class A027743 implements Sequence {

  private int mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mT = mT.multiply(7);
    return Jaguar.factor(mT.subtract(1)).phi().divide(mN);
  }
}
