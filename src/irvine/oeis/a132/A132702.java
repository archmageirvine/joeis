package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132702 Decimal expansion of 12/Pi.
 * @author Sean A. Irvine
 */
public class A132702 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132702() {
    super(CR.valueOf(12).divide(CR.PI));
  }
}
