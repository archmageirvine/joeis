package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132719 Decimal expansion of 29/Pi.
 * @author Sean A. Irvine
 */
public class A132719 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132719() {
    super(CR.valueOf(29).divide(CR.PI));
  }
}
