package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a007.A007468;

/**
 * A058871 Sum of next n primes (A007468) is prime for odd n or half the sum is prime for even n.
 * @author Sean A. Irvine
 */
public class A058871 extends A007468 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().shiftRight((mN & 1) == 1 ? 1 : 0).isProbablePrime()) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
