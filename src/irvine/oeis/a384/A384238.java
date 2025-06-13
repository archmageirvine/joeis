package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384238 Decimal expansion of sqrt(5) - log(phi) - 1, where phi is the golden ratio.
 * @author Sean A. Irvine
 */
public class A384238 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A384238() {
    super(0, CR.FIVE.sqrt().subtract(CR.PHI.log()).subtract(CR.ONE));
  }
}
