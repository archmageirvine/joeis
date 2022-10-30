package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a007.A007504;

/**
 * A045345 Numbers k such that k divides sum of first k primes A007504(k).
 * @author Sean A. Irvine
 */
public class A045345 extends A007504 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      if (s.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
