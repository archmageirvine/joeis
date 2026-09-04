package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086447 a(n) = the least k such that prime(n+1)+prime(n+2)+...+prime(n+k) is a multiple of prime(n).
 * @author Sean A. Irvine
 */
public class A086447 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 0;
    Z q = p;
    Z sum = Z.ZERO;
    while (true) {
      ++k;
      q = mPrime.nextPrime(q);
      sum = sum.add(q);
      if (sum.mod(p).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

