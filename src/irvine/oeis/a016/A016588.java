package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016588 Decimal expansion of log(23/2).
 * @author Sean A. Irvine
 */
public class A016588 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016588() {
    super(CR.valueOf(new Q(23, 2)).log());
  }
}
