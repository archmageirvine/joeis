package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016584 Decimal expansion of log(15/2).
 * @author Sean A. Irvine
 */
public class A016584 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016584() {
    super(CR.valueOf(new Q(15, 2)).log());
  }
}
