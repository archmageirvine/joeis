package irvine.oeis.a087;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087361 For n &gt; 2, a(n) = smallest square &gt; a(n-1) and congruent to a(n-1) (mod a(n-2)).
 * @author Sean A. Irvine
 */
public class A087361 extends Sequence1 {

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
    if (mA.isOne()) {
      mA = mB;
      mB = Z.NINE;
      return mB;
    }
    Z best = null;
    for (Z x : QuadraticCongruence.solve(Z.ONE, Z.ZERO, mB.mod(mA).negate(), mA)) {
      Z x2 = x.square();
      while (x2.compareTo(mB) <= 0) {
        x = x.add(mA);
        x2 = x.square();
      }
      if (best == null || x2.compareTo(best) < 0) {
        best = x2;
      }
    }
    mA = mB;
    mB = best;
    return best;
  }
}
