package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023181 Numbers k such that Fibonacci(k) == 55 (mod k).
 * @author Sean A. Irvine
 */
public class A023181 extends A000045 {

  private long mN = 0;
  {
    setOffset(1);
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 55 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

