package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023970 First bit in fractional part of binary expansion of cube root of n.
 * @author Sean A. Irvine
 */
public class A023970 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.valueOf(++mN), CR.ONE_THIRD).multiply(CR.TWO).floor().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
