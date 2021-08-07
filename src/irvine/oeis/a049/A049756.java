package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049756 a(n)=T(n,1), array T as in A049747.
 * @author Sean A. Irvine
 */
public class A049756 extends A049747 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 1L));
  }
}
