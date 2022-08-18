package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019674 Decimal expansion of Pi/7.
 * @author Sean A. Irvine
 */
public class A019674 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019674() {
    super(0, CR.PI.divide(CR.SEVEN));
  }
}
