package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016607 Decimal expansion of log(61/2).
 * @author Sean A. Irvine
 */
public class A016607 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016607() {
    super(CR.valueOf(new Q(61, 2)).log());
  }
}
