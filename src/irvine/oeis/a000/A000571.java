package irvine.oeis.a000;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000571 Number of different score sequences that are possible in an <code>n-team round-robin</code> tournament.
 * @author Sean A. Irvine
 */
public class A000571 extends MemoryFunctionInt3<Z> implements Sequence {

  @Override
  protected Z compute(final int n, final int t, final int e) {
    if (n <= 0) {
      return Z.ZERO;
    }
    if (n == 1) {
      return t == e && e >= 0 ? Z.ONE : Z.ZERO;
    }
    if (t - e < (n * n - 3 * n + 2) / 2) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (int k = 0; k <= e; ++k) {
      s = s.add(get(n - 1, t - e, k));
    }
    return s;
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    final int t = (mN * mN - mN) / 2;
    for (int k = mN / 2; k < mN; ++k) {
      s = s.add(get(mN, t, k));
    }
    return s;
  }

}
