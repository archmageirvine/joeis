package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395259 Decimal expansion of the number defined by the continued fraction 1/(r+1/(r+1/(r + ...))), where r is the bronze ratio (A098316).
 * @author Sean A. Irvine
 */
public class A395259 extends DecimalExpansionSequence {

  private static final CR SQRT13 = CR.valueOf(13).sqrt();

  /** Construct the sequence. */
  public A395259() {
    super(0, SQRT13.multiply(6).add(38).sqrt().subtract(3).subtract(SQRT13).divide(4));
  }
}
