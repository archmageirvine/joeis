package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065876.
 * @author Sean A. Irvine
 */
public class A071572 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 0;
    while (true) {
      final Z pk = p.multiply(++k);
      if (!mPrime.nextPrime(pk).subtract(pk).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

