package irvine.oeis.a174;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A174168 A <code>(1,3) Somos-4</code> sequence.
 * @author Sean A. Irvine
 */
public class A174168 implements Sequence {

  private Z mA = Z.FIVE;
  private Z mB = Z.TWO;
  private Z mC = Z.ONE;
  private Z mD = Z.ONE;

  @Override
  public Z next() {
    final Z t = mD.multiply(mB).add(mC.square().multiply(3)).divide(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return mD;
  }
}

