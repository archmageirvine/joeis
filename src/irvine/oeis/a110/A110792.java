package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A110792 Copies of 7,3 and 1 cyclically such that every partial concatenation is a prime.
 * @author Sean A. Irvine
 */
public class A110792 extends Sequence1 {

  private final long[] mCandidates = candidates();
  private int mCandPos = -1;
  private Z mS = Z.ZERO;

  protected Z output(final StringBuilder t) {
    return new Z(t);
  }

  protected long[] candidates() {
    return new long[] {7, 3, 1};
  }

  @Override
  public Z next() {
    ++mCandPos;
    mCandPos %= mCandidates.length;
    final long c = mCandidates[mCandPos];
    final String cc = String.valueOf(c);
    final StringBuilder t = new StringBuilder();
    while (true) {
      mS = mS.multiply(10).add(c);
      t.append(cc);
      if (mS.isProbablePrime()) {
        return output(t);
      }
    }
  }
}

