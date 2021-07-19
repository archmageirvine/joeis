package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132721 Decimal expansion of 31/Pi.
 * @author Sean A. Irvine
 */
public class A132721 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132721() {
    super(CR.valueOf(31).divide(CR.PI));
  }
}
