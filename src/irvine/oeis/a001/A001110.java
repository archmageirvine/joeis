package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001110.
 * @author Sean A. Irvine
 */
public class A001110 implements Sequence {

  private Z mA = Z.valueOf(36);
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(34).add(2).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

