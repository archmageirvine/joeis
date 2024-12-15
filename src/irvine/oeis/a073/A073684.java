package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073684 Sum of next a(n) successive primes is prime.
 * @author Sean A. Irvine
 */
public class A073684 extends A000040 {

  @Override
  public Z next() {
    long cnt = 1;
    Z sum = super.next();
    do {
      sum = sum.add(super.next());
      ++cnt;
    } while (!sum.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
