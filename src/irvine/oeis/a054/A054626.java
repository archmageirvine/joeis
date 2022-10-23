package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054626 Number of n-bead necklaces with 7 colors.
 * @author Sean A. Irvine
 */
public class A054626 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Integers.SINGLETON.sum(1, mN, k -> Z.SEVEN.pow(LongUtils.gcd(mN, k))).divide(mN);
  }
}
