package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016613 Decimal expansion of log(73/2).
 * @author Sean A. Irvine
 */
public class A016613 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016613() {
    super(CR.valueOf(new Q(73, 2)).log());
  }
}
