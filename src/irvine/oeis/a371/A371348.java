package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-12-01.ack/decexp at 2024-12-01 23:03

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A371348 Decimal expansion of sqrt(c'*(exp(1/c') - 1)) where c'=7/4.
 * Formula: sqrt(7*(exp(4/7)-1)/4)
 * @author Georg Fischer
 */
public class A371348 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A371348() {
    super(1, CR.valueOf(new Q(7, 4)).multiply(CR.valueOf(new Q(4, 7)).exp().subtract(1)).sqrt());
  }
}
