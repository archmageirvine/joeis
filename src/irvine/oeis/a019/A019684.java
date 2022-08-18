package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019684 Decimal expansion of Pi/17.
 * @author Sean A. Irvine
 */
public class A019684 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019684() {
    super(0, CR.PI.divide(CR.valueOf(17)));
  }
}
