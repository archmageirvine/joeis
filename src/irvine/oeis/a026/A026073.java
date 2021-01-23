package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026073 T(2n,n), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026073 extends A024996 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.valueOf(mN + 1);
    }
    return get(2 * mN, mN);
  }
}

