package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016611 Decimal expansion of log(69/2).
 * @author Sean A. Irvine
 */
public class A016611 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016611() {
    super(CR.valueOf(new Q(69, 2)).log());
  }
}
