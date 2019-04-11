package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015927 Positive integers n such that <code>2^n == 2^7 (mod n)</code>.
 * @author Sean A. Irvine
 */
public class A015927 extends A015910 {

  private static final Z Z128 = Z.valueOf(128);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z128.mod(mN))) {
        return mN;
      }
    }
  }
}
