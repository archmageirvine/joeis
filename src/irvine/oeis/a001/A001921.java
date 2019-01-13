package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001921.
 * @author Sean A. Irvine
 */
public class A001921 implements Sequence {

  private Z mA = Z.valueOf(-8);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(14).subtract(mA).add(6);
    mA = mB;
    mB = t;
    return mB;
  }
}
