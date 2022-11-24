package irvine.oeis.a132;

import irvine.math.z.Z;

/**
 * A132162 a(2n+1) = 3*a(2*n) - 4*n with a(0) = 1, a(1) = 3.
 * @author Georg Fischer
 */
public class A132162 extends A132171 {

  private int mN = -1;
  private Z mA;

  @Override
  public Z next() {
    // a(2*n) = 2*n + A132171(n); a(2*n+1) = 2*n + 3*A132171(n).
    ++mN;
    if ((mN & 1) == 0) {
      mA = super.next();
      return mA.add(mN);
    }
    return mA.multiply(3).add(mN - 1);
  }
}
