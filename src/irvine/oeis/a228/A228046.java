package irvine.oeis.a228;
// Generated by gen_seq4.pl 2025-03-22/decexp at 2025-03-22 17:49

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A228046 Decimal expansion of sum of reciprocals of row 4 of the natural number array, A185787.
 * Formula: (1/ 4340)*(-2573 +  560*r*tanh(r)), where r =(Pi/2)*sqrt(31)
 * @author Georg Fischer
 */
public class A228046 extends DecimalExpansionSequence {

  private static final CR R = CR.HALF_PI.multiply(CR.valueOf(31).sqrt());

  /** Construct the sequence */
  public A228046() {
    super(0, R.multiply(R.tanh()).multiply(560).subtract(2573).divide(4340));
  }
}
