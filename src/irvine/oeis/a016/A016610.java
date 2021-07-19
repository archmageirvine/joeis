package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016610 Decimal expansion of log(67/2).
 * @author Sean A. Irvine
 */
public class A016610 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016610() {
    super(CR.valueOf(new Q(67, 2)).log());
  }
}
