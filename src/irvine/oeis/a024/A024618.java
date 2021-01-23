package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024618 Positions of primes in A024614.
 * @author Sean A. Irvine
 */
public class A024618 extends A024614 {

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
