package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026076 <code>a(n) = T(2n,n-1)</code>, where T is the array defined in <code>A024996</code>.
 * @author Sean A. Irvine
 */
public class A026076 extends A024996 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}

