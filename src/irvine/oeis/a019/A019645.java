package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019645 Decimal expansion of sqrt(Pi*e).
 * @author Sean A. Irvine
 */
public class A019645 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019645() {
    super(CR.PI.multiply(CR.E).sqrt());
  }
}
