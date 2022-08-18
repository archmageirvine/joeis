package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019743 Decimal expansion of e/6.
 * @author Sean A. Irvine
 */
public class A019743 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019743() {
    super(0, CR.E.divide(CR.SIX));
  }
}
