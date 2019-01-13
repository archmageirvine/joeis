package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001472.
 * @author Sean A. Irvine
 */
public class A001472 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;
  private Z mD = Z.ONE;
  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    final Z t = mD.add(mC.multiply(mN)).add(mA.multiply(mN).multiply(mN - 1).multiply(mN - 2));
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}

