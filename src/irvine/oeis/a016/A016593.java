package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016593 Decimal expansion of log(33/2).
 * @author Sean A. Irvine
 */
public class A016593 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016593() {
    super(CR.valueOf(new Q(33, 2)).log());
  }
}
