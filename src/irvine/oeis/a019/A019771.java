package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019771 Decimal expansion of 2*e/19.
 * @author Sean A. Irvine
 */
public class A019771 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019771() {
    super(0, CR.E.multiply(new Q(2, 19)));
  }
}
