package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027034 a(n) = T(n,2n-10), T given by A027023.
 * @author Sean A. Irvine
 */
public class A027034 extends A027023 {

  private long mN = 4;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 10);
  }
}
