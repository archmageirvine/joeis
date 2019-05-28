package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023288 Numbers n such that n remains prime through 3 iterations of function <code>f(x) = 6x + 5</code>.
 * @author Sean A. Irvine
 */
public class A023288 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(6).add(5)) && mFast.isPrime(p.multiply(36).add(35)) && mFast.isPrime(p.multiply(216).add(215))) {
        return p;
      }
    }
  }
}
