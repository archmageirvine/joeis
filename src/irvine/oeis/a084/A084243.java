package irvine.oeis.a084;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084243 Decimal expansion of c = Product_{k&gt;=1} (1 + 1/k^2)^2.
 * Formula: (cosh(2*Pi)-1)/(2*Pi^2)
 * @author Georg Fischer
 */
public class A084243 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A084243() {
    super(2, CR.TWO.multiply(CR.PI).cosh().subtract(CR.ONE).divide(CR.TWO.multiply(CR.PI.pow(CR.TWO))));
  }
}
