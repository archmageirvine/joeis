package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132718 Decimal expansion of 28/Pi.
 * @author Sean A. Irvine
 */
public class A132718 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132718() {
    super(CR.valueOf(28).divide(CR.PI));
  }
}
