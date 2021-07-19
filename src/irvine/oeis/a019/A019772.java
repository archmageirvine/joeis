package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019772 Decimal expansion of 2*e/21.
 * @author Sean A. Irvine
 */
public class A019772 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019772() {
    super(CR.E.multiply(new Q(2, 21)));
  }
}
