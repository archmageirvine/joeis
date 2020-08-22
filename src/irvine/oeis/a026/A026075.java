package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026075 a(n) = T(4n,n), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026075 extends A024996 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(4 * ++mN, mN);
  }
}

