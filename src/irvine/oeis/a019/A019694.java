package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019694 Decimal expansion of 2*Pi/5.
 * @author Sean A. Irvine
 */
public class A019694 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019694() {
    super(CR.TWO.multiply(CR.PI).divide(CR.FIVE));
  }
}
