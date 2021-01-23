package irvine.oeis.a020;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.FibonacciPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020550 4th Fibonacci polynomial evaluated at x=n!.
 * @author Sean A. Irvine
 */
public class A020550 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> F4 = FibonacciPolynomials.fibonacciPolynomial(4);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.eval(F4, mF);
  }
}
