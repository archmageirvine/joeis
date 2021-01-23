package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023165 Fib(p) == -5 (mod p).
 * @author Sean A. Irvine
 */
public class A023165 extends A000045 {

  private long mN = 0;
  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == mN - 5 || mN <= 2 || mN == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}

