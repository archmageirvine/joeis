package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023290.
 * @author Sean A. Irvine
 */
public class A023290 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(7).add(6)) && mFast.isPrime(p.multiply(49).add(48)) && mFast.isPrime(p.multiply(343).add(342))) {
        return p;
      }
    }
  }
}
