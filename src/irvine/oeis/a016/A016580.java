package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016580 Decimal expansion of log(7/2).
 * @author Sean A. Irvine
 */
public class A016580 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016580() {
    super(CR.valueOf(new Q(7, 2)).log());
  }
}
