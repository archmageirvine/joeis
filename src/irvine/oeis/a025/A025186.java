package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025186 T(4n,n), where T is the array defined in A025177.
 * @author Sean A. Irvine
 */
public class A025186 extends A025177 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(4 * ++mN, mN);
  }
}
