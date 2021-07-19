package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132707 Decimal expansion of 17/Pi.
 * @author Sean A. Irvine
 */
public class A132707 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132707() {
    super(CR.valueOf(17).divide(CR.PI));
  }
}
