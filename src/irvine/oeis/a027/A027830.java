package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027830 Numbers k such that k + (k+1)^2 + (k+2)^3 + (k+3)^4 + (k+4)^5 is prime.
 * @author Sean A. Irvine
 */
public class A027830 extends A027622 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
