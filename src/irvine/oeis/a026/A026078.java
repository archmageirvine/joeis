package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026078 a(n) = T(n,[ n/2 ]), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026078 extends A024996 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.TWO;
    }
    return get(mN, mN / 2);
  }
}

