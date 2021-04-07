package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a343.A343146;

/**
 * A046164.
 * @author Sean A. Irvine
 */
public class A046164 extends A343146 {

  private static final long TARGET_STATE = 0b1000_0111_0110_0101_0100_0011_0010_0001_0000L;
  private final boolean[] mUsed = new boolean[mTransitions.length];
  private int mN = 26;
  private long mCount = 0;
  private long mSum = 0; // Work around historical over counting

  @Override
  protected long targetState() {
    return TARGET_STATE;
  }

  private void search(final int id, final int stepsRemaining) {
    if (stepsRemaining == 0) {
      if (id == mTargetId) {
        ++mCount;
      }
      return;
    }
    for (final int newId : mTransitions[id]) {
      if (!mUsed[newId]) {
        mUsed[newId] = true;
        search(newId, stepsRemaining - 1);
        mUsed[newId] = false;
      }
    }
  }

  @Override
  public Z next() {
    mCount = 0;
    mN += 2;
    search(mStateToId.get(START_STATE), mN);
    mSum = mCount - mSum; // Work around historical inaccuracy?
    return Z.valueOf(mSum);
  }
}
