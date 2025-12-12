package irvine.oeis.a082;

import java.util.Collection;

import irvine.math.z.CubicCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082536 a(1) = 1; for n &gt; 1, a(n) = smallest number greater than a(n-1) such that a(n-1)*a(n)+1 is a cube.
 * @author Sean A. Irvine
 */
public class A082536 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mA.isOne()) {
      mA = Z.SEVEN;
      return Z.SEVEN;
    }
    final Collection<Z> soln = CubicCongruence.solve(Z.ONE, mA);
    Z res = null;
    for (final Z s : soln) {
      Z k = Z.ZERO;
      while (true) {
        final Z x = s.add(k).pow(3).subtract(1).divide(mA);
        if (x.compareTo(mA) > 0) {
          if (res == null || x.compareTo(res) < 0) {
            res = x;
          }
          break;
        }
        k = k.add(mA);
      }
    }
    mA = res;
    return res;
  }
}
