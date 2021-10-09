package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016621 Decimal expansion of log(89/2).
 * @author Sean A. Irvine
 */
public class A016621 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016621() {
    super(CR.valueOf(new Q(89, 2)).log());
  }
}
