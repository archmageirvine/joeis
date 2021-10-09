package irvine.oeis.a277;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A277723 a(n) = floor(n*tau^3) where tau is the tribonacci constant (A058265).
 * @author Sean A. Irvine
 */
public class A277723 extends PolynomialRootExpansionSequence {

  private long mN = -1;

  /** Construct the sequence. */
  public A277723() {
    super(Polynomial.create(-1, 5, -7, 1), CR.SIX, CR.SEVEN);
  }

  @Override
  public Z next() {
    return getCR().multiply(++mN).floor();
  }
}
