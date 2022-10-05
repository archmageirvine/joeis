package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005117;

/**
 * A059737 Lesser of the smallest pair of consecutive numbers divisible by an n-th power, but neither divisible by an (n+1)-st power.
 * @author Sean A. Irvine
 */
public class A059737 implements Sequence {

  private int mN = 0;

  private static final class State implements Comparable<State> {
    private final Z mValue;
    private final Z mVE;
    private final long mBase;
    private final long mK;

    private State(final long base, final long k, final Z value) {
      mBase = base;
      mK = k;
      mVE = value;
      mValue = value.multiply(k);
    }

    @Override
    public int compareTo(final State state) {
      final int c = mValue.compareTo(state.mValue);
      if (c != 0) {
        return c;
      }
      final int d = Long.compare(mBase, state.mBase);
      if (d != 0) {
        return d;
      }
      return Long.compare(mK, state.mK);
    }

    @Override
    public String toString() {
      return mValue.toString();
    }
  }

  @Override
  public Z next() {
    ++mN;
    final TreeSet<State> contenders = new TreeSet<>();
    final Sequence bases = new A005117();
    bases.next(); // skip 1
    Z b = bases.next();
    Z be = b.pow(mN);
    while (true) {
      while (contenders.size() < 2 || contenders.first().mValue.add(1).compareTo(be) >= 0) {
        contenders.add(new State(b.longValueExact(), 1, be));
        b = bases.next();
        be = b.pow(mN);
      }
      final State state = contenders.pollFirst();
      final Z v = state.mValue;
      if (v.add(1).equals(contenders.first().mValue)) {
        // If we get this far, then very likely we have the solution.
        // However, we need to still be a little careful because it is possible that mK
        // ended up being a high power.
        if (Jaguar.factor(state.mK).maxExponent() <= mN && Jaguar.factor(contenders.first().mK).maxExponent() <= mN) {
          return v;
        }
      }
      long k = state.mK;
      do {
        ++k;
      } while (LongUtils.gcd(state.mBase, k) != 1);
      contenders.add(new State(state.mBase, k, state.mVE));
    }
  }
}

