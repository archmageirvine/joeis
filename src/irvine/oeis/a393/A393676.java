package irvine.oeis.a393;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393676.
 * @author Sean A. Irvine
 */
public class A393676 extends Sequence0 {

  private int mN = -1;

  private Z count(final int n, final int start, final Set<Integer> used) {
    if (n == 0) {
      return Z.ONE;
    }
    if (n < 0) {
      return Z.ZERO;
    }

    Z total = Z.ZERO;
    for (int i = start; i <= n; ++i) {
      boolean ok = true;
      for (final int u : used) {
        if (Math.abs(i - u) == 2) {
          ok = false;
          break;
        }
      }
      if (ok) {
        used.add(i);
        total = total.add(count(n - i, i + 1, used));
        used.remove(i);
      }
    }
    return total;
  }

  @Override
  public Z next() {
    return count(++mN, 1, new HashSet<>());
  }
}
