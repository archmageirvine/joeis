package irvine.oeis.a273;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A273816 Decimal expansion the Bessel moment c(3,0) = Integral_{0..inf} K_0(x)^3 dx, where K_0 is the modified Bessel function of the second kind.
 * Formula: 3*Gamma(1/3)^6/(32*Pi*2^(2/3)).
 * @author Georg Fischer
 */
public class A273816 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A273816() {
    super(1, CR.THREE.multiply(CrFunctions.GAMMA.cr(CR.ONE.divide(CR.THREE)).pow(CR.SIX)).divide(CR.valueOf(32).multiply(CR.PI).multiply(CR.TWO.pow(CR.TWO.divide(CR.THREE)))));
  }
}
