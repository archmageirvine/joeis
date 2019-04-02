package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016277 Expansion of 1/((1-2x)(1-3x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016277 implements Sequence {

  private Z mA = Z.FIVE;
  private Z mB = Z.valueOf(9);
  private Z mC = Z.valueOf(4);

  @Override
  public Z next() {
    mA = mA.multiply2();
    mB = mB.multiply(3);
    mC = mC.shiftLeft(3);
    return mA.add(mC).subtract(mB).divide(15);
  }
}
