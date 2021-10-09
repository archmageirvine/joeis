package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132712 Decimal expansion of 22/Pi.
 * @author Sean A. Irvine
 */
public class A132712 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132712() {
    super(CR.valueOf(22).divide(CR.PI));
  }
}
