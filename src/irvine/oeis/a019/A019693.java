package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019693 Decimal expansion of 2*Pi/3.
 * @author Sean A. Irvine
 */
public class A019693 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019693() {
    super(CR.TAU.divide(CR.THREE));
  }
}
