package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110792.
 * @author Sean A. Irvine
 */
public class A110792 implements Sequence {

  private final long[] mCandidates = candidates();
  private int mCandPos = -1;
  private Z mS = Z.ZERO;

  protected Z output(final StringBuilder t) {
    return new Z(t.toString());
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

