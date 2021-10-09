package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019763 Decimal expansion of 2*e/3.
 * @author Sean A. Irvine
 */
public class A019763 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019763() {
    super(CR.E.multiply(new Q(2, 3)));
  }
}
