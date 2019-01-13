package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001084.
 * @author Sean A. Irvine
 */
public class A001084 implements Sequence {

  private Z mA = Z.valueOf(-60);
  private Z mB = Z.valueOf(-3);

  @Override
  public Z next() {
    final Z t = mB.multiply(20).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

