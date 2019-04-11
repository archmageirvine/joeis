package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015929 Positive integers n such that <code>2^n == 2^8 (mod n)</code>.
 * @author Sean A. Irvine
 */
public class A015929 extends A015910 {

  private static final Z Z256 = Z.valueOf(256);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z256.mod(mN))) {
        return mN;
      }
    }
  }
}
