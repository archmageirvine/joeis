package irvine.oeis.a193;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 09:46

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A193088 Decimal expansion of the coefficient of x in the reduction of (cos(x))^2 by x^2-&gt;x+1 (negated).
 * Formula:
 * @author Georg Fischer
 */
public class A193088 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A193088() {
    super(0, CR.ZERO.subtract(CR.ONE.sin().multiply(CR.FIVE.sqrt().sin()).divide(CR.FIVE.sqrt())).negate());
  }
}
