package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001081 a(n) = 16*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A001081 implements Sequence {

  private Z mA = Z.valueOf(127);
  private Z mB = Z.EIGHT;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(4).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

