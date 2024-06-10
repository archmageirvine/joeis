package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A070324 Max( sigma(k) : k=1,2,3,...,n ).
 * @author Sean A. Irvine
 */
public class A070324 extends A000203 {

  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    mMax = mMax.max(super.next());
    return mMax;
  }
}
