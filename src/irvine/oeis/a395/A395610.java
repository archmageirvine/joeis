package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A002329 Periods of reciprocals of integers prime to 10.
 * @author Sean A. Irvine
 */
public class A395610 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395610() {
    super(1, CR.PHI.log().multiply(8).subtract(CR.ONE.divide(CR.PHI)));
  }
}
