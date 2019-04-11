package irvine.oeis.a093;

import irvine.math.z.Z;
import irvine.oeis.a054.A054225;

/**
 * A093802 Number of distinct factorizations of <code>105*2^n</code>.
 * @author Sean A. Irvine
 */
public class A093802 extends A054225 {

  private static final Z P = Z.valueOf(3 * 5 * 7);
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = P.shiftLeft(++mN);
    return get(r, r);
  }
}
