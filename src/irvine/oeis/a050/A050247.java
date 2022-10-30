package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a007.A007504;

/**
 * A050247 a(n) is the sum of the first A045345(n) primes.
 * @author Sean A. Irvine
 */
public class A050247 extends A007504 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      if (s.mod(++mN) == 0) {
        return s;
      }
    }
  }
}
