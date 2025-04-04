package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A372386 Decimal expansion of Sum_{k&gt;=0} (k^2+1) / (k^4+1).
 * Formula:
 * @author Georg Fischer
 */
public class A372386 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A372386() {
    super(1, CR.HALF.subtract(CR.PI.multiply(CR.SQRT2.multiply(CR.PI).sinh()).divide(CR.SQRT2.multiply(CR.SQRT2.multiply(CR.PI).cos().subtract(CR.SQRT2.multiply(CR.PI).cosh())))));
  }
}
