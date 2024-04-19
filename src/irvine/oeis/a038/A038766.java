package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a024.A024462;

/**
 * A038766 Triangle giving number of unbranched catapolytetragons, read by rows.
 * @author Sean A. Irvine
 */
public class A038766 extends A024462 {

  private int mN = -1;
  private int mM = 0;

  private Z factorial(final int n) {
    return n < 0 ? Z.ONE : Functions.FACTORIAL.z(n);
  }

  private Z h(final int r, final int eta) {
    final Z h = factorial(r - 1).multiply(3L * r - 2L * eta).divide(factorial(eta)).divide(factorial(r - eta));
    final int p = eta - 1;
    return p >= 0 ? h.multiply(Z.THREE.pow(p)) : h.divide(Z.THREE.pow(-p));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final Z j = super.next();
    if (mN < 3) {
      return Z.ONE;
    }
    final Z a = Binomial.binomial(mN, mM);
    final int t = 2 + (((mN + mM) & 1) == 0 ? 1 : -1) - ((mN & 1) == 0 ? 1 : - 1);
    final Z h = t == 0 ? Z.ZERO : h(mN / 2, mM / 2).multiply(t);
    return a.add(j).add(h).divide(4);
  }
}
