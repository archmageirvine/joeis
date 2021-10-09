package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019745 Decimal expansion of e/8.
 * @author Sean A. Irvine
 */
public class A019745 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019745() {
    super(CR.E.divide(CR.EIGHT));
  }
}
