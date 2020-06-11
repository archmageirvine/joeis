package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023964 First digit after decimal point of 5th root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A023964 implements Sequence {

  private static final CR TEN = CR.TEN;
  private static final CR FIFTH = CR.FIVE.inverse();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(ComputableReals.SINGLETON.pow(CR.valueOf(++mN), FIFTH).multiply(TEN).floor().mod(10));
  }
}
