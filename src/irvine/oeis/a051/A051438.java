package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051438 a(n) = prime(2^n - 1).
 * @author Sean A. Irvine
 */
public class A051438 extends A000040 {

  private long mN = 1;
  private long mT = 2;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (++mN == mT) {
        mT *= 2;
        return p;
      }
    }
  }
}

