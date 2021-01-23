package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026076 a(n) = T(2n,n-1), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026076 extends A024996 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}

