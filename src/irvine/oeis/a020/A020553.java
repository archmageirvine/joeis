package irvine.oeis.a020;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.FibonacciPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020553 7th Fibonacci polynomial evaluated at <code>x=n!</code>.
 * @author Sean A. Irvine
 */
public class A020553 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> F7 = FibonacciPolynomials.fibonacciPolynomial(7);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.eval(F7, mF);
  }
}
