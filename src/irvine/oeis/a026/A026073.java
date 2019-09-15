package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026073 <code>T(2n,n)</code>, where T is the array defined in <code>A024996</code>.
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

