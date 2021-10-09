package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019669 Decimal expansion of Pi/2.
 * @author Sean A. Irvine
 */
public class A019669 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019669() {
    super(CR.PI.divide(CR.TWO));
  }
}
