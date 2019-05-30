package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023294.
 * @author Sean A. Irvine
 */
public class A023294 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(8).add(7)) && mFast.isPrime(p.multiply(64).add(63)) && mFast.isPrime(p.multiply(512).add(511))) {
        return p;
      }
    }
  }
}
