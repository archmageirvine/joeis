package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132706 Decimal expansion of 16/Pi.
 * @author Sean A. Irvine
 */
public class A132706 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132706() {
    super(CR.valueOf(16).divide(CR.PI));
  }
}
