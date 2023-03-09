package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061717 Binary order of n^n.
 * @author Sean A. Irvine
 */
public class A061717 extends Sequence1 {

  private static final CR INV_LOG_2 = CR.TWO.log().inverse();
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log().multiply(INV_LOG_2).multiply(mN).ceil();
  }
}
