package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004052 The coding-theoretic function A(n,14,8).
 * @author Sean A. Irvine
 */
public class A004052 extends A004035 {

  private int mN = 7;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 14, 8));
  }
}
