package irvine.oeis.a099;
// Generated by gen_seq4.pl decexp at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099217 Decimal expansion of Li_3(1/2).
 * Formula: 7*zeta(3)/8-Pi^2*log(2)/12+log(2)^3/6
 * @author Georg Fischer
 */
public class A099217 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A099217() {
    super(0, CR.SEVEN.multiply(Zeta.zeta(3)).divide(CR.EIGHT).subtract(CR.PI.pow(CR.TWO).multiply(CR.TWO.log()).divide(CR.valueOf(12))).add(CR.TWO.log().pow(CR.THREE).divide(CR.SIX)));
  }
}
