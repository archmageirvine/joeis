package irvine.oeis.a322;
// Generated by gen_seq4.pl 2024-01-11/factexp at 2024-01-11 11:50

import irvine.math.cr.CR;
import irvine.oeis.cons.FactorialExpansionSequence;

/**
 * A322506 Factorial expansion of 1/exp(2) = Sum_{n&gt;=1} a(n)/n!.
 * @author Georg Fischer
 */
public class A322506 extends FactorialExpansionSequence {

  /** Construct the sequence. */
  public A322506() {
    super(1, CR.TWO.exp().inverse());
  }
}
