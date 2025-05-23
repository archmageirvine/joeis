package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-12-09.ack/decexp at 2024-12-09 23:32

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A378793 Decimal expansion of 16/(9*sqrt(1609)).
 * @author Georg Fischer
 */
public class A378793 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A378793() {
    super(0, CR.valueOf(16).divide(CR.NINE.multiply(CR.valueOf(1609).sqrt())));
  }
}
