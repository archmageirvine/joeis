package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A003455 Number of nonequivalent dissections of <code>an</code> n-gon by nonintersecting diagonals up to rotation.
 * @author Sean A. Irvine
 */
public class A003455 extends A003447 {

  private int mN = 0;

  private Polynomial<Q> h(final int r, final int n) {
    Polynomial<Q> sum = RING.zero();
    for (int k = 1; k < r; ++k) {
      sum = RING.add(sum, RING.multiply(mV.get(k, n), mV.get(r - k, n), n));
    }
    if ((r & 1) == 0) {
      sum = RING.subtract(sum, mV.get(r / 2, (n + 1) / 2).substitutePower(2));
    }
    return RING.subtract(f(r, n), RING.multiply(sum, Q.HALF));
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(h(k, mN + 3).coeff(mN + 2).toZ());
    }
    return s;
  }
}

