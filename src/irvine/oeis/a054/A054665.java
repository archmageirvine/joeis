package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054665 Number of 6-ary Lyndon words with trace 0 mod 6.
 * @author Sean A. Irvine
 */
public class A054665 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.SIX.pow(mN / d).multiply(Functions.GCD.i(d, 6)).multiply(Functions.MOBIUS.i(d))).divide(6L * mN);
  }
}
