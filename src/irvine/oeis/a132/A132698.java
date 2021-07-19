package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132698 Decimal expansion of 8/Pi.
 * @author Sean A. Irvine
 */
public class A132698 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132698() {
    super(CR.EIGHT.divide(CR.PI));
  }
}
