package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019691 Decimal expansion of Pi/24.
 * @author Sean A. Irvine
 */
public class A019691 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019691() {
    super(0, CR.PI.divide(CR.valueOf(24)));
  }
}
