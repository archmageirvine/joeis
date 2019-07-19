package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A024620 Positions of primes among the powers of primes <code>(A000961)</code>.
 * @author Sean A. Irvine
 */
public class A024620 extends A000961 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
