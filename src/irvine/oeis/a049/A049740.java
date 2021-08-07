package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049740 a(n)=T(n,n), array T as in A049735.
 * @author Sean A. Irvine
 */
public class A049740 extends A049735 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN));
  }
}
