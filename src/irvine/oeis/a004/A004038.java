package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004038 The coding-theoretic function A(n,6,5).
 * @author Sean A. Irvine
 */
public class A004038 extends A004035 {

  private int mN = 5;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 6, 5));
  }
}
