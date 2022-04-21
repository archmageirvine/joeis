package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004043 The coding-theoretic function A(n,8,8).
 * @author Sean A. Irvine
 */
public class A004043 extends A004035 {

  private int mN = 7;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 8, 8));
  }
}
