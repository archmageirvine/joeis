package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002193.
 * @author Sean A. Irvine
 */
public class A002193 implements Sequence {

  private Z mX = n();
  private Z mR = Z.ZERO;

  protected Z n() {
    return Z.TWO;
  }

  @Override
  public Z next() {
    long d = 0;
    while (mR.multiply(20).add(d).multiply(d).compareTo(mX) <= 0) {
      ++d;
    }
    --d;
    mX = mX.subtract(mR.multiply(20).add(d).multiply(d)).multiply(100);
    mR = mR.multiply(10).add(d);
    return Z.valueOf(d);
  }
}
