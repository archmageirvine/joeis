package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A372806 Decimal expansion of 90/781.
 * Formula:
 * @author Georg Fischer
 */
public class A372806 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A372806() {
    super(0, CR.valueOf(90).divide(CR.valueOf(781)));
  }
}
