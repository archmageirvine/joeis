package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019615 Decimal expansion of Pi*e/7.
 * @author Sean A. Irvine
 */
public class A019615 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019615() {
    super(CR.PI.multiply(CR.E).divide(CR.SEVEN));
  }
}
