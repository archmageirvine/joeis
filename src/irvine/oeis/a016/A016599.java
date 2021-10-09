package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016599 Decimal expansion of log(45/2).
 * @author Sean A. Irvine
 */
public class A016599 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016599() {
    super(CR.valueOf(new Q(45, 2)).log());
  }
}
