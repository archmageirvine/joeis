package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059170 Strictly undulating primes (digits alternate and differ by 1).
 * @author Sean A. Irvine
 */
public class A059170 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mValue;
    private final int mDigitPair;

    private State(final Z value, final int digitPair) {
      mValue = value;
      mDigitPair = digitPair;
    }

    @Override
    public int compareTo(final State state) {
      final int c = mValue.compareTo(state.mValue);
      if (c != 0) {
        return c;
      }
      return Integer.compare(mDigitPair, state.mDigitPair);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private Z mPrev = Z.ONE;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      // Initial config
      mA.add(new State(Z.ZERO, 1));
      for (int k = 1; k < 9; ++k) {
        mA.add(new State(Z.valueOf(k), k * 10 + k - 1));
        mA.add(new State(Z.valueOf(k), k * 10 + k + 1));
      }
      mA.add(new State(Z.NINE, 98));
    }
    while (true) {
      final State s = mA.pollFirst();
      if (s.mValue.mod(10) == s.mDigitPair % 10) {
        mA.add(new State(s.mValue.multiply(10).add(s.mDigitPair / 10), s.mDigitPair));
      } else {
        mA.add(new State(s.mValue.multiply(10).add(s.mDigitPair % 10), s.mDigitPair));
      }
      if (s.mValue.isProbablePrime() && !mPrev.equals(s.mValue)) {
        mPrev = s.mValue;
        return s.mValue;
      }
    }
  }
}
