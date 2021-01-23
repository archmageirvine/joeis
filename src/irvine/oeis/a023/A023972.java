package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023972 First bit in fractional part of binary expansion of 5th root of n.
 * @author Sean A. Irvine
 */
public class A023972 implements Sequence {

  private static final CR R = CR.FIVE.inverse();
  private long mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.valueOf(++mN), R).multiply(CR.TWO).floor().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
