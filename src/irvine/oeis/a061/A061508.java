package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061508 Smallest positive m such that n^m has at least n digits.
 * @author Sean A. Irvine
 */
public class A061508 extends Sequence1 {

  private static final CR INV_LOG_10 = CR.TEN.log().inverse();
  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 1 ? Z.ONE : CR.valueOf(mN - 1).divide(CR.valueOf(mN).log().multiply(INV_LOG_10)).ceil();
  }
}

