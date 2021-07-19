package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016620 Decimal expansion of log(87/2).
 * @author Sean A. Irvine
 */
public class A016620 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016620() {
    super(CR.valueOf(new Q(87, 2)).log());
  }
}
