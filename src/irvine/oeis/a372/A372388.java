package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A372388 Decimal expansion of Sum_{k&gt;=0} (k+2) / (2k+1)!.
 * Formula:
 * @author Georg Fischer
 */
public class A372388 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A372388() {
    super(1, CR.ONE.divide(CR.E).add(CR.FOUR.multiply(CR.ONE.sinh())).divide(CR.TWO));
  }
}
