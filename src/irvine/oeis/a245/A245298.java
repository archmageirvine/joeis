package irvine.oeis.a245;
// Generated by gen_seq4.pl decexp at 2021-08-11 22:35

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A245298 Decimal expansion of the Landau-Kolmogorov constant C(5,3) for derivatives in the case L_infinity(infinity, infinity).
 * Formula: (1/2)*(15/2)^(2/5)
 * @author Georg Fischer
 */
public class A245298 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A245298() {
    super(1, CR.HALF.multiply(CR.valueOf(15).divide(CR.TWO).pow(CR.TWO.divide(CR.FIVE))));
  }
}
