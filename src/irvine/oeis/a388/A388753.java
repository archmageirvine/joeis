package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388753 Decimal expansion of sqrt(2 * (-1+sqrt(2))).
 * @author Sean A. Irvine
 */
public class A388753 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388753() {
    super(0, CR.TWO.pow(Q.ONE_QUARTER).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()));
  }
}
