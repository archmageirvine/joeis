package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016598 Decimal expansion of log(43/2).
 * @author Sean A. Irvine
 */
public class A016598 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016598() {
    super(CR.valueOf(new Q(43, 2)).log());
  }
}
