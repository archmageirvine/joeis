package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016581 Decimal expansion of log(9/2).
 * @author Sean A. Irvine
 */
public class A016581 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016581() {
    super(CR.valueOf(new Q(9, 2)).log());
  }
}
