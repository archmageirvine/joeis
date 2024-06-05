package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054625 Number of n-bead necklaces with 6 colors.
 * @author Sean A. Irvine
 */
public class A054625 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Integers.SINGLETON.sum(1, mN, k -> Z.SIX.pow(Functions.GCD.l(mN, k))).divide(mN);
  }
}
