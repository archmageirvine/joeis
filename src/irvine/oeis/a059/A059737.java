package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005117;

/**
 * A059723.
 * @author Sean A. Irvine
 */
public class A059737 implements Sequence {

  private int mN = 0;

  private static final class State implements Comparable<State>{
    private final Z mValue;
    private final long mBase;
    private final long mK;

    private State(final long base, final long k, final Z value) {
      mBase = base;
      mK = k;
      mValue = value;
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
      while (contenders.size() < 2 || contenders.first().mValue.add(1).compareTo(b) >= 0) {
        contenders.add(new State(b.longValueExact(), 1, be));
        b = bases.next();
        be = b.pow(mN);
      }
      final State state = contenders.pollFirst();
      final Z v = state.mValue;
      if (v.add(1).equals(contenders.first().mValue)) {
        return v;
      }
      long k = state.mK;
      do {
        ++k;
      } while (LongUtils.gcd(state.mBase, k) != 1);
      contenders.add(new State(state.mBase, k, Z.valueOf(state.mBase).pow(mN).multiply(k)));
    }
  }
}

