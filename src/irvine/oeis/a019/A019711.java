package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019711 Decimal expansion of sqrt(Pi)/9.
 * @author Sean A. Irvine
 */
public class A019711 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019711() {
    super(CR.SQRT_PI.divide(CR.NINE));
  }
}
