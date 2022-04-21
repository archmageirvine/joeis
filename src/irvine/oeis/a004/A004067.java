package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004067 The coding-theoretic function A(n,6,7).
 * @author Sean A. Irvine
 */
public class A004067 extends A004035 {

  private int mN = 6;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 6, 7));
  }
}
