package irvine.oeis.a062;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062926 a(1) = 1; a(n) is the smallest square of the form k*a(n-1) + 1, k &gt; 0, i.e., a(n) == 1 (mod a(n-1)), n &gt; 2.
 * @author Sean A. Irvine
 */
public class A062926 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.FOUR;
    } else {
      for (final Z t : QuadraticCongruence.solve(Z.ONE, Z.ZERO, Z.NEG_ONE, mA)) {
        final Z s = t.square();
        if (s.compareTo(mA) > 0) {
          mA = s;
          break;
        }
      }
    }
    return mA;
  }
}

