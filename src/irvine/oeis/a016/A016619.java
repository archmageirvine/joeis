package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016619 Decimal expansion of log(85/2).
 * @author Sean A. Irvine
 */
public class A016619 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016619() {
    super(CR.valueOf(new Q(85, 2)).log());
  }
}
