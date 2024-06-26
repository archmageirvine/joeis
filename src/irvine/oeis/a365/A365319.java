package irvine.oeis.a365;
// Generated by gen_seq4.pl 2024-06-06/decexpr at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A365319 Decimal expansion of abs(Gamma(exp(i*Pi/3))).
 * Formula:
 * @author Georg Fischer
 */
public class A365319 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A365319() {
    super(0, REALS.cosh(CR.THREE.sqrt().multiply(CR.PI).divide(CR.TWO)).divide(CR.THREE.multiply(CR.PI)).multiply(3).sqrt().inverse());
  }
}
