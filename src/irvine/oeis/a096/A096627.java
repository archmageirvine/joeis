package irvine.oeis.a096;
// Generated by gen_seq4.pl decexp at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A096627 Decimal expansion of golden angle in degrees, 360*(2-phi).
 * Formula: 360*(2-phi)
 * @author Georg Fischer
 */
public class A096627 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A096627() {
    super(3, CR.valueOf(360).multiply(CR.TWO.subtract(CR.PHI)));
  }
}
