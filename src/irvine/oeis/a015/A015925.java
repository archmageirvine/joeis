package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015925 Positive integers n such that 2^n == 2^5 (mod n).
 * @author Sean A. Irvine
 */
public class A015925 extends A015910 {

  private static final Z Z32 = Z.valueOf(32);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z32.mod(mN))) {
        return mN;
      }
    }
  }
}
