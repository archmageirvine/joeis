package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019673 Decimal expansion of Pi/6.
 * @author Sean A. Irvine
 */
public class A019673 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019673() {
    super(0, CR.PI.divide(CR.SIX));
  }
}
