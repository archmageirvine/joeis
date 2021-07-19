package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016625 Decimal expansion of log(97/2).
 * @author Sean A. Irvine
 */
public class A016625 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016625() {
    super(CR.valueOf(new Q(97, 2)).log());
  }
}
