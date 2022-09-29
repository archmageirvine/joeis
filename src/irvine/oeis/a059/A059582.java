package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059582 First differences give digits of Pi = 3.1415926...
 * @author Sean A. Irvine
 */
public class A059582 implements Sequence {

  private CR mX = CR.PI.divide(CR.TEN);
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z d = mX.floor();
    mX = mX.subtract(CR.valueOf(d)).multiply(10);
    mA = mA.add(d);
    return mA;
  }
}
