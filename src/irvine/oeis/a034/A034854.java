package irvine.oeis.a034;

import java.util.ArrayList;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A034854 Triangle giving number of rooted labeled trees with <code>n &gt;= 3</code> nodes and diameter <code>d&gt;=2</code>.
 * @author Sean A. Irvine
 */
public class A034854 extends A034855 {

  private Polynomial<Q> r0(final int d, final int n) {
    if (d < 0) {
      return RING.zero();
    }
    final ArrayList<Q> coeff = new ArrayList<>();
    for (int k = 0; k <= n; ++k) {
      coeff.add(new Q(r(k, d), mF.factorial(k)));
    }
    return RING.create(coeff);
  }

  protected Z t(final int d, final int p) {
    final int dd = d / 2;
    if ((d & 1) == 0) {
      final Polynomial<Q> t0 = RING.subtract(r0(dd, p), RING.multiply(gf(dd - 1, p), r0(dd - 1, p), p));
      return t0.coeff(p).multiply(mF.factorial(p)).toZ();
    } else {
      final Polynomial<Q> t0 = RING.pow(r0(dd, p), 2, p);
      return t0.coeff(p).multiply(mF.factorial(p)).toZ().divide2();
    }
  }

  private int mP = 2;
  private int mD = 2;

  @Override
  public Z next() {
    if (++mD >= mP) {
      ++mP;
      mD = 2;
    }
    return t(mD, mP);
  }
}
