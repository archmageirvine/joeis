package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001079.
 * @author Sean A. Irvine
 */
public class A001079 implements Sequence {

  private Z mA = Z.valueOf(49);
  private Z mB = Z.FIVE;

  @Override
  public Z next() {
    final Z t = mB.multiply(10).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

