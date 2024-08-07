package irvine.oeis.a355;
// Generated by gen_seq4.pl 2024-08-02.ack/decexp at 2024-08-02 23:54

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A355500 Decimal expansion of Product_{k&gt;=1} (k - 1/2)^(1/(k - 1/2)) / k^(1/k).
 * Formula:
 * @author Georg Fischer
 */
public class A355500 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A355500() {
    super(0, CR.TWO.pow(CR.GAMMA.multiply(2).add(CR.TWO.log())).inverse());
  }
}
