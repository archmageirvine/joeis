package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001205.
 * @author Sean A. Irvine
 */
public class A001205 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.NEG_ONE;
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = mC.multiply2().add(mA.multiply(mN - 1)).multiply(mN++).divide(2);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
