package irvine.oeis.a356;
// Generated by gen_seq4.pl 2025-02-03.ack/decexp at 2025-02-03 18:14

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A356983 Decimal expansion of Pi * e^(-Pi/2).
 * Formula: Pi*e^(-Pi/2)
 * @author Georg Fischer
 */
public class A356983 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A356983() {
    super(0, CR.PI.multiply(CR.E.pow(CR.ZERO.subtract(CR.PI.divide(CR.TWO)))));
  }
}
