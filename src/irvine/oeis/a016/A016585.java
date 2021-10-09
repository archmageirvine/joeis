package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016585 Decimal expansion of log(17/2).
 * @author Sean A. Irvine
 */
public class A016585 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016585() {
    super(CR.valueOf(new Q(17, 2)).log());
  }
}
