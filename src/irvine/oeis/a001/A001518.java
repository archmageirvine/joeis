package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001518.
 * @author Sean A. Irvine
 */
public class A001518 implements Sequence {

  private int mN = -9;
  private Z mA = Z.FOUR;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    mN += 6;
    final Z t = mB.multiply(mN).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
