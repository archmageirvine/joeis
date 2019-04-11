package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015935 Positive integers n such that <code>2^n == 2^11 (mod n)</code>.
 * @author Sean A. Irvine
 */
public class A015935 extends A015910 {

  private static final Z Z2048 = Z.valueOf(2048);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z2048.mod(mN))) {
        return mN;
      }
    }
  }
}
