package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019689 Decimal expansion of Pi/22.
 * @author Sean A. Irvine
 */
public class A019689 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019689() {
    super(0, CR.PI.divide(CR.valueOf(22)));
  }
}
