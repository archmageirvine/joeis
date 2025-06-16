package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384738 Decimal expansion of 3*log(2)/4 - Pi/8.
 * @author Sean A. Irvine
 */
public class A384738 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A384738() {
    super(0, CR.LOG2.multiply(new Q(3, 4)).subtract(CR.PI.divide(8)));
  }
}
