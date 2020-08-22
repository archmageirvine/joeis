package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027051 a(n) = T(n,2n-2), T given by A027023.
 * @author Sean A. Irvine
 */
public class A027051 extends A027023 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 2);
  }
}
