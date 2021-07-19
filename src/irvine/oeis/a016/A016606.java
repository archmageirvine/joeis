package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016606 Decimal expansion of log(59/2).
 * @author Sean A. Irvine
 */
public class A016606 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016606() {
    super(CR.valueOf(new Q(59, 2)).log());
  }
}
