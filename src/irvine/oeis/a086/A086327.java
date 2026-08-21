package irvine.oeis.a086;

import irvine.math.IntegerUtils;
import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialFactorSequence;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086327 Number of factors over Q in the factorization of the Chebyshev polynomial of the second kind U_n(x).
 * @author Sean A. Irvine
 */
public class A086327 extends Sequence1 {

  private final ChebyshevPolynomials mC = new ChebyshevPolynomials(2);
  private int mN = 0;

  @Override
  public Z next() {
//    final Polynomial<Q> p0 = Polynomial.create("(-2)*x+(-1)*x^2+2*x^3+1*x^4");
//    System.out.println("Test1: " + p0 + " -> " + new PolynomialFactorSequence(p0));
//    final Polynomial<Q> p1 = Polynomial.create("(-4)+8*x+(-1)*x^2-5*x^3+1*x^4+1*x^5");
//    System.out.println("Test2: " + p1 + " -> " + new PolynomialFactorSequence(p1));

    final Polynomial<Z> c = mC.getValue(++mN);
    System.out.println(mN + ": " + c);
    final PolynomialFactorSequence pfs = new PolynomialFactorSequence(PolynomialUtils.zToQ(c));
    return Z.valueOf(IntegerUtils.sum(pfs.asMap().values()));
  }
}

