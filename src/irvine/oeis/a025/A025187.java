package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025187 a(n) = T(2n,n-1), where T is the array defined in A025177.
 * @author Sean A. Irvine
 */
public class A025187 extends A025177 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
