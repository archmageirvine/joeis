package irvine.oeis.a359;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A359532 Decimal expansion of 2*log(2)/Pi.
 * Formula:
 * @author Georg Fischer
 */
public class A359532 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A359532() {
    super(0, CR.FOUR.log().divide(CR.PI));
  }
}
