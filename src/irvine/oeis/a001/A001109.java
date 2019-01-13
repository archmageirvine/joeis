package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001109.
 * @author Sean A. Irvine
 */
public class A001109 implements Sequence {

  private Z mA = Z.valueOf(-6);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(6).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

