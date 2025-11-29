package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390698 Decimal expansion of cos(5*Pi/33).
 * @author Sean A. Irvine
 */
public class A390698 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A390698() {
    super(0, CR.FIVE.multiply(CR.PI).divide(33).cos());
  }
}
