package irvine.oeis.a144;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A144982 Decimal expansion of cos(Pi/24) = cos(7.5 degrees).
 * @author Georg Fischer
 */
public class A144982 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A144982() {
    super(0, CR.PI.divide(CR.valueOf(24)).cos());
  }
}
