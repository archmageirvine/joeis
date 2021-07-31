package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023176 Numbers n such that Fibonacci(n) == 5 (mod n).
 * @author Sean A. Irvine
 */
public class A023176 extends A000045 {

  private long mN = 0;
  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 5 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

