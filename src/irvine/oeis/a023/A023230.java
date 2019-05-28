package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023230 Numbers k such that k and <code>8*k + 5</code> are both prime.
 * @author Sean A. Irvine
 */
public class A023230 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(8).add(5))) {
        return p;
      }
    }
  }
}
