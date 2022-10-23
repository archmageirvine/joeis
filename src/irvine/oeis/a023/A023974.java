package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023974 First bit in fractional part of binary expansion of 7th root of n.
 * @author Sean A. Irvine
 */
public class A023974 extends Sequence1 {

  private static final CR R = CR.SEVEN.inverse();
  private long mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.valueOf(++mN), R).multiply(CR.TWO).floor().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
