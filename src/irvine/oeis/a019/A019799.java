package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019799 Decimal expansion of sqrt(2*e)/3.
 * @author Sean A. Irvine
 */
public class A019799 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019799() {
    super(CR.E.multiply(CR.TWO).sqrt().divide(CR.THREE));
  }
}
