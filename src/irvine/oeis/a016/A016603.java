package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016603 Decimal expansion of log(53/2).
 * @author Sean A. Irvine
 */
public class A016603 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016603() {
    super(CR.valueOf(new Q(53, 2)).log());
  }
}
