package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019766 Decimal expansion of 2*e/9.
 * @author Sean A. Irvine
 */
public class A019766 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019766() {
    super(0, CR.E.multiply(new Q(2, 9)));
  }
}
