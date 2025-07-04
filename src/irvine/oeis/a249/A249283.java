package irvine.oeis.a249;
// Generated by gen_seq4.pl 2025-05-27.ack/decexp at 2025-05-27 23:49

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A249283 Decimal expansion of K(3/4), where K is the complete elliptic integral of the first kind.
 * Formula:
 * @author Georg Fischer
 */
public class A249283 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A249283() {
    super(1, CR.PI.divide(CR.ONE.agm(CR.TWO)));
  }
}
