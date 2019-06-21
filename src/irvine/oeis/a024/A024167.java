package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024167 <code>a(n) = n!*(1 - 1/2 + 1/3 - ... + c/n)</code>, where c <code>= (-1)^(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A024167 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mA.multiply(++mN).multiply(mN).add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
