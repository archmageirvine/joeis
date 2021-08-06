package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049621 a(n) = T(n,n+1), array T as in A049615.
 * @author Sean A. Irvine
 */
public class A049621 extends A049615 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 1));
  }
}
