package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-13.ack/decexp at 2025-07-13 21:23

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A385918 Decimal expansion of log_10(1 + 1/8).
 * Formula: log_10(1 + 1/8).
 * @author Georg Fischer
 */
public class A385918 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A385918() {
    super(-1, CR.valueOf(new Q(1, 8)).add(CR.ONE).log10());
  }
}
