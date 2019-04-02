package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015921 Positive integers n such that 2^n == 4 (mod n).
 * @author Sean A. Irvine
 */
public class A015921 extends A015910 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.FOUR.mod(mN))) {
        return mN;
      }
    }
  }
}
