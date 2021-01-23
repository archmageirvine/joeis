package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027027 a(n) = T(n, 2n-3), T given by A027023.
 * @author Sean A. Irvine
 */
public class A027027 extends A027023 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 3);
  }
}
