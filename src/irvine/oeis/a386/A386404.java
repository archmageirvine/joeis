package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-25.ack/decexp at 2025-07-25 21:47

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A386404 Decimal expansion of zeta(5)/5.
 * Formula: Decimal expansion of zeta(5)/5.
 * @author Georg Fischer
 */
public class A386404 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A386404() {
    super(0, Zeta.zeta(5).divide(5));
  }
}
