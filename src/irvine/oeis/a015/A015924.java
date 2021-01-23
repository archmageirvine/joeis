package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015924 Positive integers n such that 2^n == 16 (mod n).
 * @author Sean A. Irvine
 */
public class A015924 extends A015910 {

  private static final Z Z16 = Z.valueOf(16);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z16.mod(mN))) {
        return mN;
      }
    }
  }
}
