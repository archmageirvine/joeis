package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A070320 Max( phi(k) : k=1,2,3,...,n ).
 * @author Sean A. Irvine
 */
public class A070320 extends A000010 {

  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    mMax = mMax.max(super.next());
    return mMax;
  }
}
