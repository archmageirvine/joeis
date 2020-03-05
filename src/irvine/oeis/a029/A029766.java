package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a040.A040039;

/**
 * A029766 Unary-binary rooted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A029766 extends A040039 {

  // Conjectural: DO NOT USE THIS TO EXTEND SEQUENCE

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return super.next().multiply(mF);
  }
}
