package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053014 a(n) is the smallest number which has n consecutive divisors k, k+1, ..., k+n-1 such that the quotients all begin with the same digit.
 * @author Sean A. Irvine
 */
public class A053014 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mA;
    private final long mK;
    private final long mM;

    private State(final Z a, final long k, final long m) {
      mA = a;
      mK = k;
      mM = m;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mA.compareTo(o.mA);
      if (c != 0) {
        return c;
      }
      final int d = Long.compare(mK, o.mK);
      if (d != 0) {
        return d;
      }
      return Long.compare(mM, o.mM);
    }

    private boolean is(final long n) {
      final char initialDigit = mA.divide(mK).toString().charAt(0);
      for (long j = 1; j < n; ++j) {
        if (mA.divide(mK + j).toString().charAt(0) != initialDigit) {
          return false;
        }
      }
      return true;
    }

    @Override
    public String toString() {
      return mA + " " + mK + " " + mM;
    }

    @Override
    public int hashCode() {
      return mA.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mA.equals(other.mA) && mK == other.mK && mM == other.mM;
    }
  }

  private long mN = 0;

  private Z lcm(final long start, final long length) {
    Z prod = Z.ONE;
    for (long j = 0; j < length; ++j) {
      prod = prod.lcm(Z.valueOf(start + j));
    }
    return prod;
  }

  @Override
  public Z next() {
    long k = ++mN;
    final TreeSet<State> queue = new TreeSet<>();
    Z next = lcm(k, mN);
    while (true) {

      // This is somewhat heuristic
      queue.add(new State(next, k, 1));
      next = lcm(++k, mN);

      final State s = queue.pollFirst();
      if (s.is(mN)) {
        return s.mA;
      }
      queue.add(new State(lcm(s.mK, mN).multiply(s.mM + 1), s.mK, s.mM + 1));
    }
  }
}
