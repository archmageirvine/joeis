package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015937 Positive integers n such that 2^n == 2^12 (mod n).
 * @author Sean A. Irvine
 */
public class A015937 extends A015910 {

  private static final Z Z4096 = Z.valueOf(4096);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z4096.mod(mN))) {
        return mN;
      }
    }
  }
}
