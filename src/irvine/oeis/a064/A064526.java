package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064526 Define a pair of sequences by p(0) = 0, q(0) = p(1) = q(1) = 1, q(n+1) = p(n)*q(n-1), p(n+1) = q(n+1) + q(n) for n &gt; 0; then a(n) = p(n) and A064183(n) = q(n).
 * @author Sean A. Irvine
 */
public class A064526 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
      return Z.ONE;
    } else if (mA.isZero()) {
      mA = mB;
      mB = Z.TWO;
      return Z.TWO;
    } else if (Z.ONE.equals(mA)) {
      mA = mB;
      mB = Z.THREE;
      return Z.THREE;
    }
    final Z t = mB.square().add(mA.square()).subtract(mB.multiply(mA).multiply(mA.add(1))).divide(Z.ONE.subtract(mA));
    mA = mB;
    mB = t;
    return t;
  }
}

