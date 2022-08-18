package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019699 Decimal expansion of 2*Pi/15 = (4*Pi/3)/10.
 * @author Sean A. Irvine
 */
public class A019699 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019699() {
    super(0, CR.TAU.divide(CR.valueOf(15)));
  }
}
