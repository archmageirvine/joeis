package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a006.A006094;

/**
 * A023515 <code>a(n) = prime(n)*prime(n-1) - 1</code>.
 * @author Sean A. Irvine
 */
public class A023515 extends A006094 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().subtract(1);
  }
}
