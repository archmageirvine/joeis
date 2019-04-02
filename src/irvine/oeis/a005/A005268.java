package irvine.oeis.a005;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005268 Number of elementary sequences of length n.
 * @author Sean A. Irvine
 */
public class A005268 implements Sequence {

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

  private int mN = 0;

  private void add(final State state) {
    if (!mSeq.contains(state)) {
      mSeq.add(state.copy()); // Deep copy
    }
  }

  private void search(final State seq) {
    int prev = 0;
    final int lead = seq.get(mN - 2);
    seq.set(lead); // Propagate current last number
    add(seq);
    for (int k = mN - 2; k > 0; --k) {
      final int sk = seq.get(k);
      if (sk + seq.get(k - 1) <= lead) {
        break;
      }
      for (int j = k - 1; j >= 0; --j) {
        final int s = sk + seq.get(j);
        if (s <= lead) {
          break;
        }
        if (s != prev) {
          prev = s; // Efficiency
          seq.set(s);
          add(seq);
        }
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
      //mSeq = new TreeSet<>(mComparator);
      mSeq = new HashSet<>();
      for (final State seq : prev) {
        search(new State(seq)); // Makes the state one longer
      }
    }
    //System.out.println(mSeq);
    return Z.valueOf(mSeq.size());
  }

}

