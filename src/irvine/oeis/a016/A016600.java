package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016600 Decimal expansion of log(47/2).
 * @author Sean A. Irvine
 */
public class A016600 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016600() {
    super(CR.valueOf(new Q(47, 2)).log());
  }
}
