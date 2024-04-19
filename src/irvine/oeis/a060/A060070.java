package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a059.A059530;

/**
 * A060070 Number of T_0-tricoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A060070 extends A059530 {

  private int mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    if (mN > 2) {
      int k = 0;
      final Polynomial<Polynomial<Q>> egf = get(mN, 2 * mN);
      while (true) {
        ++k;
        final Z t = egf.coeff(k).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
        if (!sum.isZero() && t.isZero()) {
          break;
        }
        sum = sum.add(t);
      }
    }
    return sum;
  }
}
