package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019750 Decimal expansion of e/13.
 * @author Sean A. Irvine
 */
public class A019750 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019750() {
    super(CR.E.divide(CR.valueOf(13)));
  }
}
