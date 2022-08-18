package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019749 Decimal expansion of e/12.
 * @author Sean A. Irvine
 */
public class A019749 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019749() {
    super(0, CR.E.divide(CR.valueOf(12)));
  }
}
