package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027031 a(n) = T(n,2n-7), T given by A027023.
 * @author Sean A. Irvine
 */
public class A027031 extends A027023 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 7);
  }
}
