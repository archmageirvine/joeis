package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016608 Decimal expansion of log(63/2).
 * @author Sean A. Irvine
 */
public class A016608 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016608() {
    super(CR.valueOf(new Q(63, 2)).log());
  }
}
