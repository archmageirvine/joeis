package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001609 a(1) = a(2) = 1, a(3) = 4; thereafter a(n) = a(n-1) + a(n-3).
 * @author Sean A. Irvine
 */
public class A001609 extends Sequence1 {

  private Z mA = Z.valueOf(-2);
  private Z mB = Z.ZERO;
  private Z mC = Z.THREE;

  @Override
  public Z next() {
    final Z t = mA.add(mC);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
