package irvine.oeis.a083;

import java.util.Collection;
import java.util.HashSet;

import irvine.math.z.CubicCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083203 a(1) = 1, then smallest number not included earlier such that a(n)*a(n+1) + 1 is a cube.
 * @author Sean A. Irvine
 */
public class A083203 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mUsed.add(Z.ZERO);
      mUsed.add(Z.ONE);
      return Z.ONE;
    }
    if (mA.isOne()) {
      mA = Z.SEVEN;
      mUsed.add(Z.SEVEN);
      return Z.SEVEN;
    }
    final Collection<Z> soln = CubicCongruence.solve(Z.ONE, mA);
    Z res = null;
    for (final Z s : soln) {
      Z k = Z.ZERO;
      while (true) {
        final Z x = s.add(k).pow(3).subtract(1).divide(mA);
        if (!mUsed.contains(x)) {
          if (res == null || x.compareTo(res) < 0) {
            res = x;
          }
          break;
        }
        k = k.add(mA);
      }
    }
    mA = res;
    mUsed.add(res);
    return res;
  }
}
