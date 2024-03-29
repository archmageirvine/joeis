package irvine.oeis.a237;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A237192 Decimal expansion of 2^i + 2^(-i), where i = sqrt(-1).
 * @author Georg Fischer
 */
public class A237192 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A237192() {
    super(1, CR.TWO.multiply(CR.TWO.log().cos()));
  }
}
