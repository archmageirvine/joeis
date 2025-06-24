package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078251 a(n) = smallest multiple of the n-th prime whose decimal expansion is nnn...n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A078251 extends A000040 {

  private long mN = 0;
  private long mM = 10;

  @Override
  public Z next() {
    final Z p = super.next();
    if (++mN == 1 || mN == 3) {
      return Z.ZERO;
    }
    if (mN == mM) {
      mM *= 10;
    }
    Z t = Z.ZERO;
    while (true) {
      t = t.multiply(mM).add(mN);
      if (t.mod(p).isZero()) {
        return t;
      }
    }
  }
}

