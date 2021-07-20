package irvine.oeis.a160;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160332 Decimal expansion of the one real root of x^3-8x-10.
 * @author Sean A. Irvine
 */
public class A160332 extends DecimalExpansionSequence {

  private static final CR THIRD = CR.THREE.inverse();
  private static final CR SQRT = CR.valueOf(163).divide(CR.valueOf(27)).sqrt();

  /** Construct the sequence. */
  public A160332() {
    super(CR.FIVE.add(SQRT).pow(THIRD).add(CR.FIVE.subtract(SQRT).pow(THIRD)));
  }
}
