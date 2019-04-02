package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015932 Positive integers n such that 2^n == 2^10 (mod n).
 * @author Sean A. Irvine
 */
public class A015932 extends A015910 {

  private static final Z Z1024 = Z.valueOf(1024);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z1024.mod(mN))) {
        return mN;
      }
    }
  }
}
