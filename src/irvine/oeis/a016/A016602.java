package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016602 Decimal expansion of log(51/2).
 * @author Sean A. Irvine
 */
public class A016602 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016602() {
    super(CR.valueOf(new Q(51, 2)).log());
  }
}
