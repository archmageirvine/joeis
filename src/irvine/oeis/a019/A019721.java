package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019721 Decimal expansion of sqrt(Pi)/19.
 * @author Sean A. Irvine
 */
public class A019721 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019721() {
    super(0, CR.SQRT_PI.divide(CR.valueOf(19)));
  }
}
