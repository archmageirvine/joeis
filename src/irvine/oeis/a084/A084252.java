package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A084252 A measure of how close r^n is to an integer where r is the real root of x^3-x-1; i.e., r = (1/2 + sqrt(23/108))^(1/3) + (1/2 - sqrt(23/108))^(1/3) = 1.3247.... (Higher absolute value of a(n) means closer, negative means less than closest integer.).
 * @author Sean A. Irvine
 */
public class A084252 extends Sequence1 {

  private final CR mR = new PolynomialRootExpansionSequence(Polynomial.create(-1, -1, 0, 1), CR.ONE, CR.TWO).getCR();
  private long mN = 0;

  @Override
  public Z next() {
    final CR rn = mR.pow(++mN);
    return rn.subtract(rn.round()).inverse().round();
  }
}
