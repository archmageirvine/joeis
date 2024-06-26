package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A371935 Decimal expansion of Sum_{k&gt;=0} (-1)^k / ((k+1)*(2*k+1)!).
 * Formula:
 * @author Georg Fischer
 */
public class A371935 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A371935() {
    super(0, CR.TWO.multiply(CR.HALF.sin()).square());
  }
}
