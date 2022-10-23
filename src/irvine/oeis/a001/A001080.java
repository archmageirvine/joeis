package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001080 a(n) = 16*a(n-1) - a(n-2) with a(0) = 0, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A001080 extends Sequence0 {

  private Z mA = Z.valueOf(-48);
  private Z mB = Z.valueOf(-3);

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(4).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

