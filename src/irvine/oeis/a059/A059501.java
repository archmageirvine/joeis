package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A059501 F(n)*2^n - 1 is prime, where F(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A059501 extends A000045 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (super.next().shiftLeft(++mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
