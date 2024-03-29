package irvine.oeis.a182;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A182168 Decimal expansion of imaginary part of i^(1/4).
 * @author Georg Fischer
 */
public class A182168 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A182168() {
    super(0, CR.PI.divide(CR.EIGHT).sin());
  }
}
