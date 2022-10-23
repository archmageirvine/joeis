package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001110 Square triangular numbers: numbers that are both triangular and square.
 * @author Sean A. Irvine
 */
public class A001110 extends Sequence0 {

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

