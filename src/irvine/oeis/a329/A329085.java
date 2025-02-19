package irvine.oeis.a329;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A329085 Decimal expansion of Sum_{k&gt;=0} 1/(k^2+4).
 * Formula:
 * @author Georg Fischer
 */
public class A329085 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A329085() {
    super(0, CR.ONE.add(CR.TWO.multiply(CR.PI).multiply(CR.TWO.multiply(CR.PI).coth())).divide(CR.EIGHT));
  }
}
