package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016622 Decimal expansion of log(91/2).
 * @author Sean A. Irvine
 */
public class A016622 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016622() {
    super(CR.valueOf(new Q(91, 2)).log());
  }
}
