package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132715 Decimal expansion of 25/Pi.
 * @author Sean A. Irvine
 */
public class A132715 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132715() {
    super(CR.valueOf(25).divide(CR.PI));
  }
}
