package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059488 Expansion of generating function A_{UU}^(2)(4n;2,1,1).
 * @author Sean A. Irvine
 */
public class A059488 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE.shiftLeft(mN * mN + 2 * mN);
    for (int i = 1; i <= 2 * mN + 1; i += 2) {
      for (int j = 2; j <= 2 * mN + 1; j += 2) {
        prod = prod.multiply(2L * j - 2L * i + 1);
      }
    }
    for (int i = 1; i <= 2 * mN + 1; i += 2) {
      for (int j = 2; j <= 2 * mN + 1; j += 2) {
        prod = prod.divide(2L * j - 2L * i);
      }
    }
    return prod;
  }
}
