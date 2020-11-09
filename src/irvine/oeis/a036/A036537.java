package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A036537 Numbers whose number of divisors is a power of 2.
 * @author Sean A. Irvine
 */
public class A036537 extends A000005 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().bitCount() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
