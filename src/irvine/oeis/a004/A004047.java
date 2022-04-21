package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004047 The coding-theoretic function A(n,10,9).
 * @author Sean A. Irvine
 */
public class A004047 extends A004035 {

  private int mN = 8;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 10, 9));
  }
}
