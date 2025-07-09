package irvine.oeis.a385;

import java.util.ArrayList;
import java.util.LinkedList;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A385330 allocated for Tamas Sandor Nagy.
 * @author Sean A. Irvine
 */
public class A385330 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LinkedList<Integer> mQueuedOutput = new LinkedList<>();
  private final ArrayList<State> mStates = new ArrayList<>();
  private int mN = 0;
  private int mLabel = 0;
  private Q mAngle = Q.ZERO;
  private Q mStep = Q.ZERO;
  private int mK = 0;

  private static final class State {
    private final Q mAngle;
    private final int mLabel;
    private final int mN;

    private State(final Q angle, final int label, final int n) {
      mAngle = angle;
      mLabel = label;
      mN = n;
    }

    @Override
    public String toString() {
      return mAngle + " (" + mN + "," + mLabel + ")";
    }
  }

  protected int select(final int star, final int label) {
    return label;
  }

  private int select(final State state) {
    return select(state.mN, state.mLabel);
  }

  private void updateList(final int label) {
    if (mK < mStates.size() && mStates.get(mK).mAngle.equals(mAngle)) {
      if (mVerbose) {
        StringUtils.message("Overwrite occurred: " + mAngle + " " + mN);
      }
      mStates.set(mK, new State(mAngle, label, mN));
    } else {
      mStates.add(mK, new State(mAngle, label, mN));
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (!mQueuedOutput.isEmpty()) {
        return Z.valueOf(mQueuedOutput.pollFirst());
      }
      if (++mLabel > mN) {
        if (++mN == 1) {
          mStates.add(new State(Q.ZERO, 1, mN));
          return Z.valueOf(select(1, 1));
        }
        mLabel = 1;
        // Find bisecting angle
        assert mAngle.equals(mStates.get(mK).mAngle);
        if (mK + 1 < mStates.size()) {
          final Q next = mStates.get(mK + 1).mAngle;
          mAngle = mAngle.add(next).divide(2);
        } else {
          final Q next = mStates.get(0).mAngle.add(1);
          mAngle = mAngle.add(next).divide(2).frac();
          mK = 0;
        }
        mStep = new Q(1, mN);
        // Find position
        while (mK < mStates.size() && mStates.get(mK).mAngle.compareTo(mAngle) < 0) {
          ++mK;
        }
        updateList(mLabel);
        //System.out.println(mN + " start angle=" + mAngle + " " + mStates);
        return Z.valueOf(select(mN, mLabel));
      }
      mAngle = mAngle.add(mStep);
      if (mAngle.compareTo(Q.ONE) >= 0) {
        // Handle wrap around
        while (++mK < mStates.size()) {
          mQueuedOutput.add(select(mStates.get(mK)));
        }
        mAngle = mAngle.frac();
        mK = -1;
      }
      while (++mK < mStates.size() && mStates.get(mK).mAngle.compareTo(mAngle) < 0) {
        mQueuedOutput.add(select(mStates.get(mK)));
      }
      updateList(mLabel);
      mQueuedOutput.add(select(mN, mLabel));
    }
  }
}

