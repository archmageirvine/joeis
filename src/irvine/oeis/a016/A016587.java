package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016587 Decimal expansion of log(21/2).
 * @author Sean A. Irvine
 */
public class A016587 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016587() {
    super(CR.valueOf(new Q(21, 2)).log());
  }
}
