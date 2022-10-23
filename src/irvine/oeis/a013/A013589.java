package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013589 a(n+1) = a(n)*(a(n)+1)/2.
 * @author Sean A. Irvine
 */
public class A013589 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.multiply(mA.add(1)).divide2();
    return mA;
  }
}
