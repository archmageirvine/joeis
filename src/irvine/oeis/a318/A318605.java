package irvine.oeis.a318;
// Generated by gen_seq4.pl decexp at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A318605 Decimal expansion of geometric progression constant for Coxeter's Loxodromic Sequence of Tangent Circles.
 * Formula: 1/(phi-sqrt(phi))
 * @author Georg Fischer
 */
public class A318605 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A318605() {
    super(1, CR.ONE.divide(CR.PHI.subtract(CR.PHI.sqrt())));
  }
}
