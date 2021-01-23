package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a001.A001285;

/**
 * A005680 A squarefree ternary sequence.
 * @author Sean A. Irvine
 */
public class A005680 extends A001285 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z prev = mA;
    mA = super.next();
    if (mA.equals(prev)) {
      return Z.THREE;
    }
    return mA;
  }
}
