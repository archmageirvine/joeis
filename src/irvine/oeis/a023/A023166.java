package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023166 Numbers k such that Fibonacci(k) == -8 (mod k).
 * @author Sean A. Irvine
 */
public class A023166 extends A000045 {

  private long mN = 0;
  {
    setOffset(1);
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == mN - 8 || mN == 1 || mN == 7) {
        return Z.valueOf(mN);
      }
    }
  }
}

