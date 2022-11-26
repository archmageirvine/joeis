package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060509 Largest power of n not exceeding 2^n.
 * @author Sean A. Irvine
 */
public class A060509 extends Sequence2 {

  private static final CR INV_LOG2 = CR.TWO.log().inverse();
  private long mN = 1;

  @Override
  public Z next() {
    final CR z = CR.valueOf(++mN);
    return Z.valueOf(mN).pow(z.divide(z.log().multiply(INV_LOG2)).floor());
  }
}
