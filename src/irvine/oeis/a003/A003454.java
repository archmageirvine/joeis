package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003454.
 * @author Sean A. Irvine
 */
public class A003454 extends A003442 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(f(k, mN + 2).coeff(mN + 2).toZ());
    }
    return s;
  }
}

