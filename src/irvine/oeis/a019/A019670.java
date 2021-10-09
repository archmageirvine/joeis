package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019670 Decimal expansion of Pi/3.
 * @author Sean A. Irvine
 */
public class A019670 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019670() {
    super(CR.PI.divide(CR.THREE));
  }
}
