package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054627 Number of n-bead necklaces with 8 colors.
 * @author Sean A. Irvine
 */
public class A054627 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Integers.SINGLETON.sum(1, mN, k -> Z.EIGHT.pow(LongUtils.gcd(mN, k))).divide(mN);
  }
}
