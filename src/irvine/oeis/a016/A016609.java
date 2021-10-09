package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016609 Decimal expansion of log(65/2).
 * @author Sean A. Irvine
 */
public class A016609 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016609() {
    super(CR.valueOf(new Q(65, 2)).log());
  }
}
