package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023162 Numbers k such that F(k) == -1 (mod k), where F(n) = A000045(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A023162 extends A000045 {

  private long mN = 0;
  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == mN - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

