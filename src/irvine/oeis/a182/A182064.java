package irvine.oeis.a182;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A182064 Decimal expansion of the White House switchboard constant.
 * Formula: 1/e^((1+8^(1/(e-1)))^(1/Pi))
 * @author Georg Fischer
 */
public class A182064 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A182064() {
    super(0, CR.ONE.divide(CR.E.pow(CR.ONE.add(CR.EIGHT.pow(CR.ONE.divide(CR.E.subtract(CR.ONE)))).pow(CR.ONE.divide(CR.PI)))));
  }
}
