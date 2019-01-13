package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003056;

/**
 * A007664.
 * @author Sean A. Irvine
 */
public class A007664 extends A003056 {

  private Z mSum = null;

  @Override
  public Z next() {
    mSum = mSum == null ? Z.ZERO : mSum.add(Z.ONE.shiftLeft(super.next().intValueExact()));
    return mSum;
  }
}
