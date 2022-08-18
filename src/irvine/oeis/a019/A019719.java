package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019719 Decimal expansion of sqrt(Pi)/17.
 * @author Sean A. Irvine
 */
public class A019719 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019719() {
    super(0, CR.SQRT_PI.divide(CR.valueOf(17)));
  }
}
