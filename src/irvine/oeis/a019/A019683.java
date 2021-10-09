package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019683 Decimal expansion of Pi/16.
 * @author Sean A. Irvine
 */
public class A019683 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019683() {
    super(CR.PI.divide(CR.valueOf(16)));
  }
}
