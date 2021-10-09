package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019767 Decimal expansion of 2*e/11.
 * @author Sean A. Irvine
 */
public class A019767 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019767() {
    super(CR.E.multiply(new Q(2, 11)));
  }
}
