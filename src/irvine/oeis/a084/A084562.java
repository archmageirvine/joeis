package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a002.A002375;

/**
 * A084562 Even numbers having no more than two partitions into two odd primes.
 * @author Sean A. Irvine
 */
public class A084562 extends A002375 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().compareTo(Z.TWO) <= 0) {
        return Z.valueOf(2 * mN);
      }
    }
  }
}

