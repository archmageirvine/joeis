package irvine.oeis.a228;
// Generated by gen_seq4.pl 2025-03-22/decexp at 2025-03-22 17:49

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A228044 Decimal expansion of sum of reciprocals, row 2 of the natural number array, A185787.
 * Formula: (1/   30)*(-15 +    8*r*tanh(r)), where r =(Pi/2)*sqrt(15)
 * @author Georg Fischer
 */
public class A228044 extends DecimalExpansionSequence {

  private static final CR R = CR.HALF_PI.multiply(CR.valueOf(15).sqrt());

  /** Construct the sequence */
  public A228044() {
    super(1, R.multiply(R.tanh()).multiply(8).subtract(15).divide(30));
  }
}
