package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019765 Decimal expansion of 2*e/7.
 * @author Sean A. Irvine
 */
public class A019765 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019765() {
    super(CR.E.multiply(new Q(2, 7)));
  }
}
