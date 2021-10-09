package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016590 Decimal expansion of log(27/2).
 * @author Sean A. Irvine
 */
public class A016590 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016590() {
    super(CR.valueOf(new Q(27, 2)).log());
  }
}
