package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004039 The coding-theoretic function A(n,6,6).
 * @author Sean A. Irvine
 */
public class A004039 extends A004035 {

  private int mN = 5;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 6, 6));
  }
}
