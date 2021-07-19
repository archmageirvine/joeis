package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016612 Decimal expansion of log(71/2).
 * @author Sean A. Irvine
 */
public class A016612 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016612() {
    super(CR.valueOf(new Q(71, 2)).log());
  }
}
