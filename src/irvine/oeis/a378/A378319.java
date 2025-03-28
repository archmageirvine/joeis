package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-11-27.ack/decexp at 2024-11-27 22:04

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A378319 Decimal expansion of sqrt(2)*(sqrt(6) - 1)/5.
 * Formula: Decimal expansion of sqrt(2)*(sqrt(6) - 1)/5.
 * @author Georg Fischer
 */
public class A378319 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A378319() {
    super(0, CR.SQRT2.multiply(CR.SIX.sqrt().subtract(CR.ONE)).divide(CR.FIVE));
  }
}
