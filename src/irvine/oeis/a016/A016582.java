package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016582 Decimal expansion of log(11/2).
 * @author Sean A. Irvine
 */
public class A016582 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016582() {
    super(CR.valueOf(new Q(11, 2)).log());
  }
}
