package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132696 Decimal expansion of 6/Pi.
 * @author Sean A. Irvine
 */
public class A132696 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132696() {
    super(CR.SIX.divide(CR.PI));
  }
}
