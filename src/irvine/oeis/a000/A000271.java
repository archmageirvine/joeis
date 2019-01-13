package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000271.
 * @author Sean A. Irvine
 */
public class A000271 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.NEG_ONE;
  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    final Z t = mB.add(mC).multiply(mN).add(mA);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
