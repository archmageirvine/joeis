package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015922 Numbers n such that 2^n == 8 (mod n).
 * @author Sean A. Irvine
 */
public class A015922 extends A015910 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.EIGHT.mod(mN))) {
        return mN;
      }
    }
  }
}
