package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019681 Decimal expansion of Pi/14.
 * @author Sean A. Irvine
 */
public class A019681 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019681() {
    super(0, CR.PI.divide(CR.valueOf(14)));
  }
}
