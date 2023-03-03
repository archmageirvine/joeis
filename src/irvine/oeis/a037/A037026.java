package irvine.oeis.a037;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037026 Number of B-trees of order 4 with n leaves.
 * @author Sean A. Irvine
 */
public class A037026 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(0, 0, 1, 1, 1);
  private Polynomial<Z> mA = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mA = RING.add(RING.x(), RING.substitute(mA, C, mN));
    return mA.coeff(mN);
  }
}
