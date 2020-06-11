package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023973 First bit in fractional part of binary expansion of 6th root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A023973 implements Sequence {

  private static final CR R = CR.SIX.inverse();
  private long mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.valueOf(++mN), R).multiply(CR.TWO).floor().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
