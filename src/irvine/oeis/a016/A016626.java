package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016626 Decimal expansion of log(99/2).
 * @author Sean A. Irvine
 */
public class A016626 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016626() {
    super(CR.valueOf(new Q(99, 2)).log());
  }
}
