package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132709 Decimal expansion of 19/Pi.
 * @author Sean A. Irvine
 */
public class A132709 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132709() {
    super(CR.valueOf(19).divide(CR.PI));
  }
}
