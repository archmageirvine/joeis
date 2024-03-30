package irvine.oeis.a126;

import irvine.math.z.Z;

/**
 * A126452 Column 1 of triangle A126450; a(n) = C( C(n+3,3), n).
 * @author Georg Fischer
 */
public class A126452 extends A126450 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN, 1);
  }
}

