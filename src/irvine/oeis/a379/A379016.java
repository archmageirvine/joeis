package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A379016 Decimal expansion of 50*Pi/1296.
 * Formula:
 * @author Georg Fischer
 */
public class A379016 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A379016() {
    super(0, CR.valueOf(50).multiply(CR.PI).divide(CR.valueOf(1296)));
  }
}
