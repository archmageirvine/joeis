package irvine.oeis.a004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004802.
 * @author Sean A. Irvine
 */
public class A004802 implements Sequence {

  private final List<Z> mPowers = new ArrayList<>();
  private Z mPrev = Z.NEG_ONE;

  protected int numberTerms() {
    return 2;
  }

  protected int power() {
    return 10;
  }

  protected int min() {
    return 1;
  }

  private static final class State implements Comparable<State> {
    private final int[] mBases;
    private final Z mSum;

    private State(final A004802 seq, final int[] bases) {
      mBases = bases;
      Z s = Z.ZERO;
      for (final int n : bases) {
        while (seq.mPowers.size() <= n) {
          seq.mPowers.add(Z.valueOf(seq.mPowers.size()).pow(seq.power()));
        }
        s = s.add(seq.mPowers.get(n));
      }
      mSum = s;
    }

    @Override
    public int compareTo(final State that) {
      final int c = mSum.compareTo(that.mSum);
      if (c != 0) {
        return c;
      }
      for (int k = 0; k < mBases.length; ++k) {
        final int d = Integer.compare(mBases[k], that.mBases[k]);
        if (d != 0) {
          return d;
        }
      }
      return 0;
    }

    @Override
    public boolean equals(final Object that) {
      return that instanceof State && compareTo((State) that) == 0;
    }

    @Override
    public int hashCode() {
      return mSum.hashCode();
    }
  }

  private final TreeSet<State> mPriority = new TreeSet<>();
  {
    final int[] a = new int[numberTerms()];
    Arrays.fill(a, min());
    mPriority.add(new State(this, a));
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mPriority.pollFirst();
      final int[] a = s.mBases;
      for (int k = 0; k < a.length; ++k) {
        if (k == a.length - 1) {
          a[k]++;
          mPriority.add(new State(this, a));
          break;
        }
        if (a[k] < a[k + 1]) {
          final int[] b = Arrays.copyOf(a, a.length);
          b[k]++;
          mPriority.add(new State(this, b));
        }
      }
      final Z v = s.mSum;
      // This check ensures we don't report the same number twice if there are multiple representations
      if (!v.equals(mPrev)) {
        mPrev = v;
        return v;
      }
    }
  }
}
