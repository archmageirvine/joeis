package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059489 Expansion of generating function A_{UU}^(2)(4n;1,1,1).
 * @author Sean A. Irvine
 */
public class A059489 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.valueOf(-3).pow((long) mN * mN).shiftLeft(2 * mN);
    for (int i = 1; i <= 2 * mN + 1; ++i) {
      for (int j = 2; j <= 2 * mN + 1; j += 2) {
        prod = prod.multiply(3L * j - 3L * i + 2);
      }
    }
    for (int i = 1; i <= 2 * mN + 1; ++i) {
      for (int j = 2; j <= 2 * mN + 1; j += 2) {
        prod = prod.divide(j - i + 2L * mN + 1);
      }
    }
    return prod;
  }
}
