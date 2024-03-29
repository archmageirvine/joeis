package irvine.oeis.a244;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A244676 Decimal expansion of sum_(n&gt;=1) (H(n)^3/(n+1)^6) where H(n) is the n-th harmonic number.
 * Formula: -37/7560*Pi^6*zeta(3)+zeta(3)^3-11/120*Pi^4*zeta(5)+1/2*Pi^2*zeta(7)+197/24*zeta(9)
 * @author Georg Fischer
 */
public class A244676 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A244676() {
    super(0, CR.ZERO.subtract(CR.valueOf(37).divide(CR.valueOf(7560)).multiply(CR.PI.pow(CR.SIX)).multiply(Zeta.zeta(3))).add(Zeta.zeta(3).pow(CR.THREE)).subtract(CR.valueOf(11).divide(CR.valueOf(120)).multiply(CR.PI.pow(CR.FOUR)).multiply(Zeta.zeta(5))).add(CR.ONE.divide(CR.TWO).multiply(CR.PI.pow(CR.TWO)).multiply(Zeta.zeta(7))).add(CR.valueOf(197).divide(CR.valueOf(24)).multiply(Zeta.zeta(9))));
  }
}
