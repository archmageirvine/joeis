package irvine.oeis.a113;
// Generated by gen_seq4.pl decexp at 2021-08-11 22:35

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A113786 Decimal expansion of the solution to the equation sqrt(n)+sqrt(n+1)+sqrt(n+2)=sqrt(9n+8).
 * Formula: (1/24)*(2*(3*(90+sqrt(1509)))^(1/3)+2*(3*(90-sqrt(1509)))^(1/3)-9)
 * @author Georg Fischer
 */
public class A113786 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A113786() {
    super(1, CR.ONE.divide(CR.valueOf(24)).multiply(CR.TWO.multiply(CR.THREE.multiply(CR.valueOf(90).add(CR.valueOf(1509).sqrt())).pow(CR.ONE.divide(CR.THREE))).add(CR.TWO.multiply(CR.THREE.multiply(CR.valueOf(90).subtract(CR.valueOf(1509).sqrt())).pow(CR.ONE.divide(CR.THREE)))).subtract(CR.NINE)));
  }
}
