package irvine.oeis.a126;

import irvine.math.z.Z;

/**
 * A126458 Column 0 of triangle A126457; a(n) = C( C(n+2,3) + 3, n).
 * @author Georg Fischer
 */
public class A126458 extends A126457 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 0);
  }
}

