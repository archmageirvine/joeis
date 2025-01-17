package irvine.oeis.a346;
// Generated by gen_seq4.pl decexp at 2021-07-19 22:13

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346042 Decimal expansion of Sum_{k&gt;=0} 2^floor(k/2)/(k!^2).
 * Formula: (1/4)*(2+sqrt(2))*besselI0(2^(5/4))+(1/4)*(2-sqrt(2))*besselJ0(2^(5/4))
 * @author Georg Fischer
 */
public class A346042 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346042() {
    super(1, CR.ONE.divide(CR.FOUR).multiply(CR.TWO.add(CR.TWO.sqrt())).multiply(CrFunctions.BESSEL_I0.cr(CR.TWO.pow(CR.FIVE.divide(CR.FOUR)))).add(CR.ONE.divide(CR.FOUR).multiply(CR.TWO.subtract(CR.TWO.sqrt())).multiply(CrFunctions.BESSEL_J0.cr(CR.TWO.pow(CR.FIVE.divide(CR.FOUR))))));
  }
}
