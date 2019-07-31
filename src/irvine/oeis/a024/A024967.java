package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003072;

/**
 * A024967 Positions of primes in <code>A003072</code>.
 * @author Sean A. Irvine
 */
public class A024967 extends A003072 {

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
