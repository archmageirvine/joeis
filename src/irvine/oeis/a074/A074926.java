package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074926 Numbers n such that p(n)*p(n+1)+4 is a prime.
 * @author Sean A. Irvine
 */
public class A074926 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (p.multiply(mPrime.nextPrime(p)).add(4).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
