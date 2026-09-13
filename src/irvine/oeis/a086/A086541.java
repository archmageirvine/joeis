package irvine.oeis.a086;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086541 a(1) = 1, a(2) = 4; a(n) = smallest square of the form k*a(n-1) + a(n-2), k &gt; 0.
 * @author Sean A. Irvine
 */
public class A086541 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.FOUR;
      return mB;
    }
    for (final Z s : QuadraticCongruence.solve(Z.ONE, Z.ZERO, mA.negate(), mB)) {
      if (!s.isOne()) {
        final Z ss = s.square();
        if (ss.compareTo(mB) > 0) {
          mA = mB;
          mB = ss;
          return ss;
        }
      }
    }
    throw new RuntimeException();
  }
}
