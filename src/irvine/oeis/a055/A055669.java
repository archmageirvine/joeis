package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a008.A008864;

/**
 * A055669 Number of prime Hurwitz quaternions of norm prime(n).
 * @author Sean A. Irvine
 */
public class A055669 extends A008864 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      super.next();
      return Z.valueOf(24);
    }
    return super.next().multiply(24);
  }
}
