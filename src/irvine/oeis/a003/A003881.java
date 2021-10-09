package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A003881 Decimal expansion of Pi/4.
 * @author Sean A. Irvine
 */
public class A003881 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A003881() {
    super(CR.PI.divide(CR.FOUR));
  }
}
