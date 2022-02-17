package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054665 Number of 6-ary Lyndon words with trace 0 mod 6.
 * @author Sean A. Irvine
 */
public class A054665 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.SIX.pow(mN / d).multiply(IntegerUtils.gcd(d, 6)).multiply(Mobius.mobius(d))).divide(6L * mN);
  }
}
