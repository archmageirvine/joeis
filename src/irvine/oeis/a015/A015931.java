package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015931 Positive integers n such that 2^n (mod n) == 2^9 (mod n).
 * @author Sean A. Irvine
 */
public class A015931 extends A015910 {

  private static final Z Z512 = Z.valueOf(512);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z512.mod(mN))) {
        return mN;
      }
    }
  }
}
