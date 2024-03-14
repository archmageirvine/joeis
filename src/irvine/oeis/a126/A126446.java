package irvine.oeis.a126;

import irvine.math.z.Z;

/**
 * A126446 Column 0 of triangle A126445; a(n) = binomial( binomial(n+2,3), n).
 * @author Georg Fischer
 */
public class A126446 extends A126445 {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN, 0);
  }
}

