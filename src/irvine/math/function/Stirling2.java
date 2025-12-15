package irvine.math.function;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
class Stirling2 extends AbstractFunction2 {

  private final HashMap<Pair<Integer, Integer>, Z> mSecondKind = new HashMap<>();

  @Override
  public Z z(final long n, final long m) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (m < 0) {
      return Z.ZERO;
    }
    if (n == m) {
      return Z.ONE;
    }
    if (n == 0 || m == 0 || n < m) {
      return Z.ZERO;
    }
    if (n > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    final Pair<Integer, Integer> key = new Pair<>((int) n, (int) m);
    final Z s = mSecondKind.get(key);
    if (s != null) {
      return s;
    }
    final Z r = z(n - 1, m - 1).add(z(n - 1, m).multiply(m));
    mSecondKind.put(key, r);
    return r;
  }
}
