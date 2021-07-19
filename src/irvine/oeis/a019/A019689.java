package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019689 Decimal expansion of Pi/22.
 * @author Sean A. Irvine
 */
public class A019689 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019689() {
    super(CR.PI.divide(CR.valueOf(22)));
  }
}
