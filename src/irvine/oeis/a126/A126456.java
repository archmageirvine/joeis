package irvine.oeis.a126;

import irvine.math.z.Z;

/**
 * A126456 Column 1 of triangle A126454; a(n) = C( C(n+3,3) + 1, n).
 * @author Georg Fischer
 */
public class A126456 extends A126454 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN, 1);
  }
}

