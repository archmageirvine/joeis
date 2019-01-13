package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001078.
 * @author Sean A. Irvine
 */
public class A001078 implements Sequence {

  private Z mA = Z.valueOf(-20);
  private Z mB = Z.valueOf(-2);

  @Override
  public Z next() {
    final Z t = mB.multiply(10).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

