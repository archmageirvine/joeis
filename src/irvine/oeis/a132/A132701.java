package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132701 Decimal expansion of 11/Pi.
 * @author Sean A. Irvine
 */
public class A132701 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132701() {
    super(CR.valueOf(11).divide(CR.PI));
  }
}
