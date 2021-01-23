package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038563 Indices of primes appearing in A038562.
 * @author Sean A. Irvine
 */
public class A038563 extends A000040 {

  private final long[] mA = new long[10];
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      ++mA[(int) p.mod(10)];
      if (mA[1] == mA[9] && mA[3] == mA[7]) {
        return Z.valueOf(mN);
      }
    }
  }
}
