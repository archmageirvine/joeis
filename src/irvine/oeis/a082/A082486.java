package irvine.oeis.a082;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A082486 Decimal expansion of the constant c satisfying Sum_{k&gt;=1} 1/c^sqrtint(k) = 1 where sqrtint(k) = floor(sqrt(k)).
 * Formula:
 * @author Georg Fischer
 */
public class A082486 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A082486() {
    super(1, CR.FIVE.divide(CR.TWO).add(CR.valueOf(17).sqrt().divide(CR.TWO)));
  }
}
