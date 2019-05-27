package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023167 <code>Fib(p) == -13 (mod p)</code>.
 * @author Sean A. Irvine
 */
public class A023167 extends A000045 {

  private long mN = 0;
  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == mN - 13 || mN <= 4) {
        return Z.valueOf(mN);
      }
    }
  }
}

