package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059879 Those n for which the absolute value of A059878[n] is prime.
 * @author Sean A. Irvine
 */
public class A059879 extends A059878 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().abs().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
