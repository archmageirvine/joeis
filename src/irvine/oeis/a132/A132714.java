package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132714 Decimal expansion of 24/Pi.
 * @author Sean A. Irvine
 */
public class A132714 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132714() {
    super(CR.valueOf(24).divide(CR.PI));
  }
}
