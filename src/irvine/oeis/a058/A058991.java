package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058991 Smallest number not a power of two whose reversal of its n-th power is a prime.
 * @author Sean A. Irvine
 */
public class A058991 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.THREE;
    while (!Functions.REVERSE.z(k.pow(mN)).isProbablePrime()) {
      k = k.add(1);
      if (k.bitCount() == 1 || k.mod(10) == 0) {
        k = k.add(1); // avoid powers of 2 and multiples of 10
      }
    }
    return k;
  }
}

