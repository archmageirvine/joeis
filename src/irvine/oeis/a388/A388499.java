package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388499 Decimal expansion of (1/2) * 2^(15/16) / (2-sqrt(2))^(1/4).
 * @author Sean A. Irvine
 */
public class A388499 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388499() {
    super(1, CR.TWO.pow(new Q(-1, 16)).divide(CR.TWO.subtract(CR.SQRT2).pow(Q.ONE_QUARTER)));
  }
}
