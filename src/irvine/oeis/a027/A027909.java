package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027909 <code>T(2n,n-1)</code>, T given by <code>A027907</code>.
 * @author Sean A. Irvine
 */
public class A027909 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(C, 2 * mN, mN - 1).coeff(mN - 1);
  }
}
