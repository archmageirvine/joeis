package irvine.oeis.a354;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A354184 allocated for Augusto Santi.
 * @author Sean A. Irvine
 */
public class A354184 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = Jaguar.factor(mA.multiply(31)).squareFreeKernel().add(Jaguar.factor(mB.multiply(31)).squareFreeKernel()).divide(31);
    mA = mB;
    mB = t;
    return t;
  }
}
