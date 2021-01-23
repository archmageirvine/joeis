package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a006.A006094;

/**
 * A023523 a(n) = prime(n)*prime(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A023523 extends A006094 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.THREE;
    }
    return super.next().add(1);
  }
}
