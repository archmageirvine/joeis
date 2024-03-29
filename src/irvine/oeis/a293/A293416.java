package irvine.oeis.a293;
// Generated by gen_seq4.pl decexpr at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A293416 Decimal expansion of the minimum ripple factor for a ninth-order, reflectionless, Chebyshev filter.
 * Formula: sqrt(exp(4*arctanh(exp(-2*9*arcsinh(sqrt(1/2*sin(Pi/9)tan(Pi/9))))))-1)
 * @author Georg Fischer
 */
public class A293416 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A293416() {
    super(0, CR.FOUR.multiply(REALS.atanh(CR.ZERO.subtract(CR.TWO.multiply(CR.NINE).multiply(REALS.asinh(CR.ONE.divide(CR.TWO).multiply(CR.PI.divide(CR.NINE).sin()).multiply(REALS.tan(CR.PI.divide(CR.NINE))).sqrt()))).exp())).exp().subtract(CR.ONE).sqrt());
  }
}
