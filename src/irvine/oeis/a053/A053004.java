package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A053004 Decimal expansion of AGM(1,sqrt(2)).
 * @author Sean A. Irvine
 */
public class A053004 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A053004() {
    super(CR.ONE.agm(CR.SQRT2));
  }
}
