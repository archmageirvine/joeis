package irvine.oeis.a126;

import irvine.math.z.Z;

/**
 * A126448 Column 2 of triangle A126445; a(n) = C( C(n+4,3) - 4, n).
 * @author Georg Fischer
 */
public class A126448 extends A126445 {

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2);
  }
}

