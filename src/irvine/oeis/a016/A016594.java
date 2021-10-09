package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016594 Decimal expansion of log(35/2).
 * @author Sean A. Irvine
 */
public class A016594 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016594() {
    super(CR.valueOf(new Q(35, 2)).log());
  }
}
