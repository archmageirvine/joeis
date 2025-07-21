package irvine.oeis.a385;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A385000 Square array read by upward antidiagonals: A(n,k) = 0 except for A(d*(m-1),m*(d-1)) = d, with n &gt;= 0, k &gt;= 0, d &gt;= 1, m &gt;= 1.
 * @author Sean A. Irvine
 */
public class A385000 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private final HashMap<Pair<Integer, Integer>, Integer> mNonzeroElements = new HashMap<>();

  private Z t(final int n, final int m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (n == 0) {
      mNonzeroElements.put(new Pair<>(m + 1, 2 * m), m + 1);
      return Z.valueOf(m + 1);
    }
    final Integer e = mNonzeroElements.remove(new Pair<>(n, m));
    if (e == null) {
      return Z.ZERO;
    }
    mNonzeroElements.put(new Pair<>(n + e, m + e - 1), e);
    return Z.valueOf(e);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
