package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A065198 Indices of record high values in A033665, ignoring those numbers that are believed never to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A065198 extends Sequence1 {

  private static final int HEURISTIC_LIMIT = 1000;
  private long mN = -1;
  protected long mBest = -1;
  private final int mBase;

  protected A065198(final int base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A065198() {
    this(10);
  }

  private int t(Z n) {
    for (int i = 0; i < HEURISTIC_LIMIT; ++i) {
      final Z r = ZUtils.reverse(n, mBase);
      if (r.equals(n)) {
        return i;
      }
      n = n.add(r);
    }
    return -1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final int i = t(n);
      if (i > mBest) {
        mBest = i;
        return n;
      }
    }
  }
}
