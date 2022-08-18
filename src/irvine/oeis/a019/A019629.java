package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019629 Decimal expansion of Pi*e/21.
 * @author Sean A. Irvine
 */
public class A019629 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019629() {
    super(0, CR.PI.multiply(CR.E).divide(CR.valueOf(21)));
  }
}
