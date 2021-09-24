package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023168 Numbers k such that Fib(k) == -21 (mod k).
 * @author Sean A. Irvine
 */
public class A023168 extends A000045 {

  private long mN = 0;
  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == (21 * mN - 21) % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

