package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016589 Decimal expansion of log(25/2).
 * @author Sean A. Irvine
 */
public class A016589 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016589() {
    super(CR.valueOf(new Q(25, 2)).log());
  }
}
