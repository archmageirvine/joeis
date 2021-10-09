package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132716 Decimal expansion of 26/Pi.
 * @author Sean A. Irvine
 */
public class A132716 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132716() {
    super(CR.valueOf(26).divide(CR.PI));
  }
}
