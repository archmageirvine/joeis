package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010799 a(n) = n!*(n+1)!*(n+2)!*(n+3)!*(n+4)! / ( 2!*3!*4!*5! ).
 * @author Sean A. Irvine
 */
public class A010799 extends Sequence1 {

  private long mN = 4;
  private Z mF0 = Z.ONE;
  private Z mF1 = Z.TWO;
  private Z mF2 = Z.SIX;
  private Z mF3 = Z.valueOf(24);

  @Override
  public Z next() {
    final Z r = mF0;
    mF0 = mF1;
    mF1 = mF2;
    mF2 = mF3;
    mF3 = mF3.multiply(++mN);
    return r.multiply(mF0).multiply(mF1).multiply(mF2).multiply(mF3).divide(34560);
  }
}
