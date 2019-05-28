package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023228.
 * @author Sean A. Irvine
 */
public class A023228 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(8).add(1))) {
        return p;
      }
    }
  }
}
