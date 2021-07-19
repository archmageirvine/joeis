package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019773 Decimal expansion of 2*e/23.
 * @author Sean A. Irvine
 */
public class A019773 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019773() {
    super(CR.E.multiply(new Q(2, 23)));
  }
}
