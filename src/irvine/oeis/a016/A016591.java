package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016591 Decimal expansion of log(29/2).
 * @author Sean A. Irvine
 */
public class A016591 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016591() {
    super(CR.valueOf(new Q(29, 2)).log());
  }
}
