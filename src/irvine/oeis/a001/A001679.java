package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A001679.
 * @author Sean A. Irvine
 */
public class A001679 extends A001678 {

  {
    super.next();
    super.next();
    super.next();
  }

  private int mN = 1;

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> f = polynomial();
    if (++mN == 2) {
      return Z.ONE;
    }
    final Polynomial<Z> u = RING.add(RING.pow(f, 2, mN), f.substitutePower(2, mN));
    final Polynomial<Z> t = RING.subtract(RING.add(f, RING.shift(f, 1)), RING.divide(u, Z.TWO));
    return t.coeff(mN - 1);
  }
}
