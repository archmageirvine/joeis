package irvine.oeis.a005;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005272 Number of Van Lier sequences of length <code>n</code>.
 * @author Sean A. Irvine
 */
public class A005272 implements Sequence {

  private static class State {

    private final int[] mState;
    private int mPrevHashM;
    private int mHash;

    State(final int... state) {
      mState = state;
      mHash = 0;
    }

    State(final State prev) {
      mState = Arrays.copyOf(prev.mState, prev.mState.length + 1);
      mPrevHashM = 31 * prev.mHash;
      mHash = prev.mPrevHashM;
    }

    State copy() {
      final State copy = new State(Arrays.copyOf(mState, mState.length));
      copy.mPrevHashM = mPrevHashM;
      copy.mHash = mHash;
      return copy;
    }

    void set(final int v) {
      mState[mState.length - 1] = v;
      mHash = mPrevHashM + v;
    }

    int get(final int n) {
      return mState[n];
    }

    int sum() {
      return (int) IntegerUtils.sum(mState);
    }

    // Masks tracks entries of mState that are forbidden
    private boolean isExpressible(final int s, final int mask) {
      if (s == 0) {
        return true;
      }
      for (int k = 0; k < mState.length; ++k) {
        final int m = 1 << k;
        if ((mask & m) == 0) {
          final int v = s - mState[k];
          if (v >= 0 && isExpressible(v, mask | m)) {
            return true;
          }
        }
      }
      return false;
    }

    boolean isVanDerLier(final int k) {
      assert k >= mState[mState.length - 1];
      for (int j = 0; j < mState.length; ++j) {
        final int i = mState[j];
        if (j == 0 || i != mState[j - 1]) { // Efficiency, this test not really needed
          final int s = k - i;
          if (!isExpressible(s, 1 << j)) {
            return false;
          }
        }
      }
      return true;
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && Arrays.equals(mState, ((State) obj).mState);
    }
  }

  private Set<State> mSeq = new HashSet<>();
  {
    mSeq.add(new State(1, 1));
  }

  private int mN = 1;

  private void add(final State state) {
    if (!mSeq.contains(state)) {
      //System.out.println("Adding " + Arrays.toString(state.mState));
      mSeq.add(state.copy()); // Deep copy
    }
  }

  private void search(final State seq) {
    final int limit = seq.sum();
    for (int k = seq.get(mN - 2); k <= limit; ++k) {
      if (seq.isVanDerLier(k)) {
        seq.set(k);
        add(seq);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > 2) {
      if (mN == 47) {
        throw new UnsupportedOperationException(); // F(47) > 2^31
      }
      final Set<State> prev = mSeq;
      mSeq = new HashSet<>();
      for (final State seq : prev) {
        search(new State(seq)); // Makes the state one longer
      }
    }
    return Z.valueOf(mSeq.size());
  }
}

