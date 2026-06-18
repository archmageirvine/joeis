package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085418 Primes reached in A085417.
 * @author Sean A. Irvine
 */
public class A085418 extends A000040 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z p = super.next();
    long k = 0;
    while (true) {
      p = p.add(++k + mN);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}

