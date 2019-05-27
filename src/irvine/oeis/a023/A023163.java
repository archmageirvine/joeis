package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023163 <code>Fibonacci(p) == -2 (mod p)</code>.
 * @author Sean A. Irvine
 */
public class A023163 extends A000045 {

  private long mN = 0;
  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == mN - 2 || mN == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

