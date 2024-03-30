package irvine.oeis.a126;

import irvine.math.z.Z;

/**
 * A126451 Column 0 of triangle A126450; a(n) = C( C(n+2,3) + 1, n).
 * @author Georg Fischer
 */
public class A126451 extends A126450 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 0);
  }
}

