package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000815.
 * @author Sean A. Irvine
 */
public class A000815 extends A000721 {

  protected Q eight(final MultivariateMonomial p) {
    // Applies sequence 8, 8, 8, ....
    int powerOf2 = 0;
    for (final Z d : p.values()) {
      powerOf2 += 3 * d.intValueExact();
    }
    return p.getCoefficient().multiply(Z.ONE.shiftLeft(powerOf2));
  }


  @Override
  public Z next() {
    final CycleIndex ans = f(++mN);
    Q s = Q.ZERO;
    for (final MultivariateMonomial p : ans.values()) {
      s = s.add(eight(p));
    }
    return s.toZ();
  }
}
