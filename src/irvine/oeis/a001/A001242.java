package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001242 Differences of reciprocals of unity.
 * @author Sean A. Irvine
 */
public class A001242 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.FOUR;
  private Z mC = Z.SIX;
  private Z mD = Z.FOUR;
  private Z mE = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(120);
    mB = mB.multiply(60);
    mC = mC.multiply(40);
    mD = mD.multiply(30);
    mE = mE.multiply(24);
    return mA.subtract(mB).add(mC).subtract(mD).add(mE).divide(24);
  }
}
