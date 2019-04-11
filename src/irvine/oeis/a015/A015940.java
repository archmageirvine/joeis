package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015940 Positive integers n such that <code>2^n == -3 (mod n)</code>.
 * @author Sean A. Irvine
 */
public class A015940 extends A015910 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(mN.subtract(3).mod(mN))) {
        return mN;
      }
    }
  }
}
