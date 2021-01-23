package irvine.oeis.a277;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A277723 a(n) = floor(n*tau^3) where tau is the tribonacci constant (A058265).
 * @author Sean A. Irvine
 */
public class A277723 implements Sequence {

  private static final ZPolynomial POLY = new ZPolynomial(Polynomial.create(-1, 5, -7, 1));
  private static final CR TAU3 = POLY.inverseMonotone(CR.SIX, CR.SEVEN).execute(CR.ZERO);

  private long mN = -1;

  @Override
  public Z next() {
    return TAU3.multiply(++mN).floor();
  }
}
