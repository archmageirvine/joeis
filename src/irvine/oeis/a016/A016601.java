package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016601 Decimal expansion of log(49/2).
 * @author Sean A. Irvine
 */
public class A016601 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016601() {
    super(CR.valueOf(new Q(49, 2)).log());
  }
}
