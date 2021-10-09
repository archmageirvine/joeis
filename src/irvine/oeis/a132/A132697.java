package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132697 Decimal expansion of 7/Pi.
 * @author Sean A. Irvine
 */
public class A132697 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132697() {
    super(CR.SEVEN.divide(CR.PI));
  }
}
