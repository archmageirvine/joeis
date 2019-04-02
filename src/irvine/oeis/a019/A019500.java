package irvine.oeis.a019;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019500 Number of 6-ary search trees on n keys.
 * @author Sean A. Irvine
 */
public class A019500 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1, 1, 1);
  private Polynomial<Z> mA = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mA = RING.add(C, RING.pow(mA, 6, mN - 5).shift(5));
    return mA.coeff(mN);
  }
}
