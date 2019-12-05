package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027830 Numbers n such that <code>n + (n+1)^2 + (n+2)^3 + (n+3)^4 + (n+4)^5</code> is prime.
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
