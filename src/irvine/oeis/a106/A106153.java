package irvine.oeis.a106;
// Generated by gen_seq4.pl decexpr at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A106153 Decimal expansion of arcsin(sqrt(1 - (e/Pi)^2)) (in degrees), lesser angle in right triangle with hypotenuse Pi and longer leg e.
 * Formula: asin(sqrt(Pi^2-exp(2))/Pi)*(180/Pi)
 * @author Georg Fischer
 */
public class A106153 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A106153() {
    super(2, REALS.asin(CR.PI.pow(CR.TWO).subtract(CR.TWO.exp()).sqrt().divide(CR.PI)).multiply(CR.valueOf(180).divide(CR.PI)));
  }
}
