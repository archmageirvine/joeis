package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395610 Decimal expansion of 2*asinh(2) + 2*asinh(1/2) + (1 - sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A395610 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395610() {
    super(1, CR.PHI.log().multiply(8).subtract(CR.ONE.divide(CR.PHI)));
  }
}
