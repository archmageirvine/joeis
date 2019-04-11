package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016294 Expansion of <code>1/((1-2x)(1-4x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016294 implements Sequence {

  private Z mA = null;
  private Z mB = Z.FIVE;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.NINE;
    } else {
      mA = mA.multiply(12);
      mB = mB.shiftLeft(2);
      mC = mC.multiply2();
    }
    return mA.add(mC).subtract(mB).divide(5);
  }
}
