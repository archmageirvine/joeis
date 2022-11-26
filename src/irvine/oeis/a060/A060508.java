package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060508 Exponent of largest power of n &lt; 2^n.
 * @author Sean A. Irvine
 */
public class A060508 extends Sequence2 {

  private static final CR INV_LOG2 = CR.TWO.log().inverse();
  private long mN = 1;

  @Override
  public Z next() {
    final CR z = CR.valueOf(++mN);
    return z.divide(z.log().multiply(INV_LOG2)).floor();
  }
}
