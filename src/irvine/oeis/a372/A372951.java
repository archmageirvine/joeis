package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A372951 Decimal expansion of 1/(2 - log(2)).
 * Formula:
 * @author Georg Fischer
 */
public class A372951 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A372951() {
    super(0, CR.ONE.divide(CR.TWO.subtract(CR.TWO.log())));
  }
}
