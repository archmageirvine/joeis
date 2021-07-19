package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019764 Decimal expansion of 2*e/5 (or 4*e).
 * @author Sean A. Irvine
 */
public class A019764 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019764() {
    super(CR.E.multiply(CR.FOUR));
  }
}
