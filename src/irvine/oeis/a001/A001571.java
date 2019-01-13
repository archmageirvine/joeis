package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001571.
 * @author Sean A. Irvine
 */
public class A001571 implements Sequence {

  private Z mA = Z.valueOf(-3);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(2).subtract(mA).add(1);
    mA = mB;
    mB = t;
    return t;
  }
}
