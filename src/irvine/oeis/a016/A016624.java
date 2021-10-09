package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016624 Decimal expansion of log(95/2).
 * @author Sean A. Irvine
 */
public class A016624 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016624() {
    super(CR.valueOf(new Q(95, 2)).log());
  }
}
