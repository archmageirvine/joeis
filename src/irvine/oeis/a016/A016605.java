package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016605 Decimal expansion of log(57/2).
 * @author Sean A. Irvine
 */
public class A016605 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016605() {
    super(CR.valueOf(new Q(57, 2)).log());
  }
}
