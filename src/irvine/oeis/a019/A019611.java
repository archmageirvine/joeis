package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019611 Decimal expansion of Pi*e/3.
 * @author Sean A. Irvine
 */
public class A019611 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019611() {
    super(CR.PI.multiply(CR.E).divide(CR.THREE));
  }
}
