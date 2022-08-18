package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019680 Decimal expansion of Pi/13.
 * @author Sean A. Irvine
 */
public class A019680 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019680() {
    super(0, CR.PI.divide(CR.valueOf(13)));
  }
}
