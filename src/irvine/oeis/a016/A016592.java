package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016592 Decimal expansion of log(31/2).
 * @author Sean A. Irvine
 */
public class A016592 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016592() {
    super(CR.valueOf(new Q(31, 2)).log());
  }
}
