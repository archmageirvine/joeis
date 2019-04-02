package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002502 Number of connected relations.
 * @author Sean A. Irvine
 */
public class A002502 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.FOUR;
  private Z mC = Z.THREE;
  private Z mD = Z.valueOf(12);
  private Z mE = Z.SIX;
  
  @Override
  public Z next() {
    mA = mA.multiply(15);
    mB = mB.shiftLeft(3);
    mC = mC.multiply(6);
    mD = mD.multiply(5);
    mE = mE.shiftLeft(2);
    return mA.subtract(mB).subtract(mC).add(mD).subtract(mE);
  }
}
