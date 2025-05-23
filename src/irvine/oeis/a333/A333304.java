package irvine.oeis.a333;
// Generated by gen_seq4.pl decexpr at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A333304 Decimal expansion of (arccosh(2)/6)^(1/4)*Gamma(3/4)/(2*sqrt(Pi)).
 * Formula: (arccosh(2)/6)^(1/4)*Gamma(3/4))/(2*sqrt(Pi))
 * @author Georg Fischer
 */
public class A333304 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A333304() {
    super(0, REALS.acosh(CR.TWO).divide(CR.SIX).pow(CR.ONE.divide(CR.FOUR)).multiply(CrFunctions.GAMMA.cr(CR.THREE.divide(CR.FOUR))).divide(CR.TWO.multiply(CR.PI.sqrt())));
  }
}
