package irvine.oeis.a126;

import irvine.math.z.Z;

/**
 * A126459 Column 1 of triangle A126457; a(n) = C( C(n+3,3) + 2, n).
 * @author Georg Fischer
 */
public class A126459 extends A126457 {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN, 1);
  }
}

