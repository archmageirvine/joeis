package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390699 Decimal expansion of cos(7*Pi/33).
 * @author Sean A. Irvine
 */
public class A390699 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A390699() {
    super(0, CR.SEVEN.multiply(CR.PI).divide(33).cos());
  }
}
