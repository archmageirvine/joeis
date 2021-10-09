package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019717 Decimal expansion of sqrt(Pi)/15.
 * @author Sean A. Irvine
 */
public class A019717 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019717() {
    super(CR.SQRT_PI.divide(CR.valueOf(15)));
  }
}
