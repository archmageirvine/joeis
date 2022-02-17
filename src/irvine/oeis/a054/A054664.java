package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054664 Number of 4-ary Lyndon words of length n with trace 0 mod 4.
 * @author Sean A. Irvine
 */
public class A054664 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.ONE.shiftLeft(2 * mN / d).multiply(IntegerUtils.gcd(d, 4)).multiply(Mobius.mobius(d))).divide(4L * mN);
  }
}
