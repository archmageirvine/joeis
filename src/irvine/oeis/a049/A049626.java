package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049626 a(n) = T(n,4), array T as in A049615.
 * @author Sean A. Irvine
 */
public class A049626 extends A049615 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 4));
  }
}
