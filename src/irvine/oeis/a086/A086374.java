package irvine.oeis.a086;

import irvine.math.IntegerUtils;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialFactorSequence;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086374 Number of factors over Q in the factorization of T_n(x) + 1 where T_n(x) is the Chebyshev polynomial of the first kind.
 * @author Sean A. Irvine
 */
public class A086374 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final ChebyshevPolynomials mC = new ChebyshevPolynomials(1);
  private int mN = 0;

  @Override
  public Z next() {
    final Polynomial<Z> c = RING.add(mC.getValue(++mN), RING.one());
    final PolynomialFactorSequence pfs = new PolynomialFactorSequence(PolynomialUtils.zToQ(c));
    return Z.valueOf(IntegerUtils.sum(pfs.asMap().values()));
  }
}

