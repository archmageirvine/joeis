package irvine.oeis.a263;
// Generated by gen_seq4.pl 2025-03-23.ack/decexpr at 2025-03-23 22:08

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A263491 Decimal expansion of the generalized hypergeometric function 3F2(1/2,1/2,3/2; 1,1;x) at x=1/4.
 * Formula:
 * @author Georg Fischer
 */
public class A263491 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A263491() {
    super(1, REALS.hypergeometric(new CR[] {CR.HALF, CR.HALF, CR.valueOf(new Q(3, 2))}, new CR[] {CR.ONE, CR.ONE}, CR.valueOf(new Q(1, 4))));
  }
}
