package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A065198 Indices of record high values in A033665, ignoring those numbers that are believed never to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A065198 extends AbstractSequence {

  private static final int HEURISTIC_LIMIT = 1000;
  private long mN = -1;
  protected long mBest = -1;
  private final int mBase;

  protected A065198(final int offset, final int base) {
    super(offset);
    mBase = base;
  }

  /** Construct the sequence. */
  public A065198() {
    this(1, 10);
  }

  private int t(Z n) {
    for (int i = 0; i < HEURISTIC_LIMIT; ++i) {
      final Z r = Functions.REVERSE.z(mBase, n);
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
