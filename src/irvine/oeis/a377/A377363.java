package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 09:46

import irvine.math.cr.CR;
import irvine.oeis.a059.A059956;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A377363 Decimal expansion of 12/Pi^2.
 * Formula:
 * @author Georg Fischer
 */
public class A377363 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A059956 = new A059956();

  /** Construct the sequence */
  public A377363() {
    super(1, CR.TWO.multiply(A059956.getCR()));
  }
}
