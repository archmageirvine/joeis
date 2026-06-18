package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085422 A sequence analogous to the Lucas numbers (A000032), with ratios converging to Pi.
 * @author Sean A. Irvine
 */
public class A085422 extends Sequence0 {

  private static final CR C = CR.PI.subtract(CR.PI.inverse());
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.NEG_ONE;
        return Z.NEG_ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = C.multiply(mB).add(mA).floor();
    mA = mB;
    mB = t;
    return t;
  }
}

