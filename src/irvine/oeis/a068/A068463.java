package irvine.oeis.a068;
// Generated by gen_seq4.pl 2024-01-11/factexp at 2024-01-11 11:50

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.FactorialExpansionSequence;

/**
 * A068463 Factorial expansion of Gamma(3/4) = Sum_{n&gt;=1} a(n)/n! where Gamma is Euler's gamma function.
 * @author Georg Fischer
 */
public class A068463 extends FactorialExpansionSequence {

  /** Construct the sequence. */
  public A068463() {
    super(1, CrFunctions.GAMMA.cr(CR.valueOf(new Q(3, 4))));
  }
}
