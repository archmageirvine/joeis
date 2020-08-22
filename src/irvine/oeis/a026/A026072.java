package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026072 a(n) = T(2n-1,n), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026072 extends A024996 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN).max(Z.ONE);
  }
}

