package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023299 Numbers n such that n remains prime through 3 iterations of function <code>f(x) = 9x + 10</code>.
 * @author Sean A. Irvine
 */
public class A023299 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(9).add(10)) && mFast.isPrime(p.multiply(81).add(100)) && mFast.isPrime(p.multiply(729).add(910))) {
        return p;
      }
    }
  }
}
