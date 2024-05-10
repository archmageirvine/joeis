package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A068155 Primes in increasing order with oscillating end digit pattern 1,3,7,9,7,3,1,3,7,9,7,3,1...
 * @author Sean A. Irvine
 */
public class A068155 extends Sequence0 {

  private static final long[] DIGITS = {1, 3, 7, 9, 7, 3};
  private int mN = -1;
  private final A000040 mSeq = new A000040();

  @Override
  public Z next() {
    if (++mN == DIGITS.length) {
      mN = 0;
    }
    while (true) {
      final Z p = mSeq.next();
      if (p.mod(10) == DIGITS[mN]) {
        return p;
      }
    }
  }
}
