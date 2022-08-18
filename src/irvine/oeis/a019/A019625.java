package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019625 Decimal expansion of Pi*e/17.
 * @author Sean A. Irvine
 */
public class A019625 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019625() {
    super(0, CR.PI.multiply(CR.E).divide(CR.valueOf(17)));
  }
}
