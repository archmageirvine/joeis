package irvine.oeis.a036;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036233 Inverse Colombian function.
 * @author Sean A. Irvine
 */
public class A036233 implements Sequence {

  private static final class State {
    private final HashSet<Long> mMembers = new HashSet<>();
    private final long mHead;
    private long mTail;

    private State(final long start) {
      mHead = start;
      mTail = start;
      mMembers.add(mHead);
    }
  }

  private final ArrayList<State> mA = new ArrayList<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (final State sumSeq : mA) {
      if (sumSeq.mTail < mN) {
        sumSeq.mTail += ZUtils.digitSum(sumSeq.mTail);
        sumSeq.mMembers.add(sumSeq.mTail);
      }
      if (sumSeq.mMembers.contains(mN)) {
        return Z.valueOf(sumSeq.mHead);
      }
    }
    mA.add(new State(mN));
    return Z.valueOf(mN);
  }
}

