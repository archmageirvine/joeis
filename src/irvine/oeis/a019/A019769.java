package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019769 Decimal expansion of 2*e/15.
 * @author Sean A. Irvine
 */
public class A019769 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019769() {
    super(CR.E.multiply(new Q(2, 15)));
  }
}
