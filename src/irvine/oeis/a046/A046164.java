package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a343.A343146;

/**
 * A046164 Number of distinct solutions to reverse the 8 puzzle (3 X 3 analog of the 4 X 4 15 puzzle) in 28, 30, 32, ... moves.
 * @author Sean A. Irvine
 */
public class A046164 extends A343146 {

  /** Construct the sequence. */
  public A046164() {
    super(14);
  }

  private static final long TARGET_STATE = 0b1000_0111_0110_0101_0100_0011_0010_0001_0000L;
  private boolean[] mUsed = null;
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
  protected void init() {
    super.init();
    if (mUsed == null) {
      mUsed = new boolean[mTransitions.length];
    }
  }

  @Override
  public Z next() {
    init();
    mCount = 0;
    mN += 2;
    search(mStateToId.get(START_STATE), mN);
    mSum = mCount - mSum; // Work around historical inaccuracy?
    return Z.valueOf(mSum);
  }
}
