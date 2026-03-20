package irvine.oeis.a393;

import java.util.BitSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393676 a(n) = number of partitions of n into distinct parts such that if x and y are parts and x &lt; y then y - x != 2.
 * @author Sean A. Irvine
 */
public class A393676 extends Sequence0 {

  private int mN = -1;

  private Z count(final int n, final int start, final BitSet used) {
    if (n == 0) {
      return Z.ONE;
    }
    if (n < 0) {
      return Z.ZERO;
    }
    Z total = Z.ZERO;
    for (int i = start; i <= n; ++i) {
      boolean ok = true;
      for (int u = used.nextSetBit(0); u >= 0; u = used.nextSetBit(u + 1)) {
        if (Math.abs(i - u) == 2) {
          ok = false;
          break;
        }
      }
      if (ok) {
        used.set(i);
        total = total.add(count(n - i, i + 1, used));
        used.clear(i);
      }
    }
    return total;
  }

  @Override
  public Z next() {
    return count(++mN, 1, new BitSet());
  }
}
