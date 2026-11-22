package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385150 Smallest starting x which reaches the Antihydra halting condition for the first time at 3*n+1 terms of the iteration x -&gt; floor(3*x/2).
 * @author Gregory Morse
 */
public class A385150 extends Sequence0 {
  private int mN = -1;

  private boolean stopsAt(long a, final int steps) {
    int b = 0;
    Z large = null;
    for (int k = 1; k <= steps; ++k) {
      if (large == null) {
        b += (a & 1) == 0 ? 2 : -1;
        if (a > Long.MAX_VALUE / 2) {
          large = Z.valueOf(a).add(a / 2);
        } else {
          a += a / 2;
        }
      } else {
        b += large.isOdd() ? -1 : 2;
        large = large.add(large.divide2());
      }
      if (b < 0) {
        return k == steps;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    final int steps = Math.addExact(Math.multiplyExact(3, ++mN), 1);
    for (long k = 1; k != Long.MAX_VALUE; ++k) {
      if (stopsAt(k, steps)) {
        return Z.valueOf(k);
      }
    }
    throw new UnsupportedOperationException();
  }
}
