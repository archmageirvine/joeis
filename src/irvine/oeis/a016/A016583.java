package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016583 Decimal expansion of log(13/2).
 * @author Sean A. Irvine
 */
public class A016583 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016583() {
    super(CR.valueOf(new Q(13, 2)).log());
  }
}
