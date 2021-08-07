package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049715 a(n)=T(n,0), array T as in A049747.
 * @author Sean A. Irvine
 */
public class A049715 extends A049747 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 0));
  }
}
