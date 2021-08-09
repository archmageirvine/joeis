package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049752 a(n) = T(n,n), array T as in A049747.
 * @author Sean A. Irvine
 */
public class A049752 extends A049747 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN));
  }
}
