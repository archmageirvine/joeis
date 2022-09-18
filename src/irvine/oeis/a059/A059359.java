package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059359 Numbers n such that n = A059333(A059333(n)).
 * @author Sean A. Irvine
 */
public class A059359 extends A059333 {

  private long mN = 0;

  @Override
  public Z next() {
    while (f(f(Z.valueOf(++mN))).longValueExact() != mN) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
