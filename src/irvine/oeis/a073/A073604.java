package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073604 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    long k = 0;
    while (true) {
      if (q.modMultiply(++k, p).equals(Z.ONE)) {
        return q.multiply(k);
      }
    }
  }
}
