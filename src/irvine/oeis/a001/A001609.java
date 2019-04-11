package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001609 <code>a(1) = a(2) = 1, a(3) = 4</code>; thereafter <code>a(n) = a(n-1) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A001609 implements Sequence {

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
