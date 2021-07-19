package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019753 Decimal expansion of e/16.
 * @author Sean A. Irvine
 */
public class A019753 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019753() {
    super(CR.E.divide(CR.valueOf(16)));
  }
}
