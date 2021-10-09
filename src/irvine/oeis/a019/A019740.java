package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019740 Decimal expansion of e/3.
 * @author Sean A. Irvine
 */
public class A019740 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019740() {
    super(CR.E.divide(CR.THREE));
  }
}
