package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019679 Decimal expansion of Pi/12.
 * @author Sean A. Irvine
 */
public class A019679 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019679() {
    super(0, CR.PI.divide(CR.valueOf(12)));
  }
}
