package irvine.oeis.a068;
// Generated by gen_seq4.pl 2024-01-11/factexp at 2024-01-11 11:50

import irvine.math.cr.CR;
import irvine.oeis.cons.FactorialExpansionSequence;

/**
 * A068460 Factorial expansion of log(7) = Sum_{n&gt;=1} a(n)/n!.
 * @author Georg Fischer
 */
public class A068460 extends FactorialExpansionSequence {

  /** Construct the sequence. */
  public A068460() {
    super(1, CR.SEVEN.log());
  }
}
