package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054664 Number of 4-ary Lyndon words of length n with trace 0 mod 4.
 * @author Sean A. Irvine
 */
public class A054664 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.ONE.shiftLeft(2L * mN / d).multiply(Functions.GCD.i(d, 4)).multiply(Functions.MOBIUS.i(d))).divide(4L * mN);
  }
}
