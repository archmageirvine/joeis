package irvine.oeis.a019;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019501 Number of 7-ary search trees on n keys.
 * @author Sean A. Irvine
 */
public class A019501 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1, 1, 1, 1);
  private Polynomial<Z> mA = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mA = RING.add(C, RING.pow(mA, 7, mN - 6).shift(6));
    return mA.coeff(mN);
  }
}
