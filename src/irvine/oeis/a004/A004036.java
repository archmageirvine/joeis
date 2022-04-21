package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004036 The coding-theoretic function A(n,4,6) (the next term is at least 166).
 * @author Sean A. Irvine
 */
public class A004036 extends A004035 {

  private int mN = 5;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 4, 6));
  }
}
