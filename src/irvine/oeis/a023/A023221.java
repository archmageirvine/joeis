package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023221 Numbers n such that n and 6n + 5 both prime.
 * @author Sean A. Irvine
 */
public class A023221 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(6).add(5))) {
        return p;
      }
    }
  }
}
