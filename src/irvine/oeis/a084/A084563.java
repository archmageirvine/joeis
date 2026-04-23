package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a002.A002375;

/**
 * A084563 Even numbers having no more than three partitions into two odd primes.
 * @author Sean A. Irvine
 */
public class A084563 extends A002375 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().compareTo(Z.THREE) <= 0) {
        return Z.valueOf(2 * mN);
      }
    }
  }
}

