package irvine.oeis.a345;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A345449 Decimal expansion of Gascheau's value, which is defined as the smaller solution of 27*x*(1 - x) = 1.
 * @author Sean A. Irvine
 */
public class A345449 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A345449() {
    super(CR.ONE.subtract(CR.valueOf(new Q(23, 27)).sqrt()).divide(CR.TWO));
  }
}
