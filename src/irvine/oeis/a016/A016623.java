package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016623 Decimal expansion of log(93/2).
 * @author Sean A. Irvine
 */
public class A016623 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016623() {
    super(CR.valueOf(new Q(93, 2)).log());
  }
}
