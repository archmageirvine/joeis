package irvine.oeis.a392;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392714 allocated for Kian Shah.
 * @author Sean A. Irvine
 */
public class A392714 extends Sequence1 {

  // After Kian Shah

  private int mN = 0;

  private static final class State {
    private final int[] mAvail;
    private final int mS;

    private State(final int[] avail, final int s) {
      mAvail = avail;
      mS = s;
    }

    @Override
    public int hashCode() {
      return 31 * Arrays.hashCode(mAvail) + mS;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State s = (State) obj;
      return mS == s.mS && Arrays.equals(mAvail, s.mAvail);
    }
  }

  private HashMap<State, Z> mCache;

  private Z rising(final int start) {
    Z p = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      p = p.multiply(start + k);
    }
    return p;
  }

  private Z b(final int[] avail, final int s) {
    if (avail.length == 0) {
      return Z.ONE;
    }

    final State key = new State(avail, s);
    final Z cached = mCache.get(key);
    if (cached != null) {
      return cached;
    }

    Z sum = Z.ZERO;
    for (int i = 0; i < avail.length; ++i) {
      final int ns = s + avail[i] - mN - 1;
      if (ns < 0) {
        continue;
      }
      final int[] next = new int[avail.length - 1];
      System.arraycopy(avail, 0, next, 0, i);
      System.arraycopy(avail, i + 1, next, i, avail.length - i - 1);
      Z term = rising(ns + 1).multiply(b(next, ns));
      if (((avail.length - 1 - i) & 1) == 1) {
        term = term.negate();
      }
      sum = sum.add(term);
    }
    mCache.put(key, sum);
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    final int order = 2 * mN;
    final int[] avail = new int[order - 1];
    for (int k = 0; k < avail.length; ++k) {
      avail[k] = k + 2;
    }
    mCache = new HashMap<>();
    Z t = b(avail, 0).abs();
    for (int k = 0; k < order; ++k) {
      t = t.divide(Functions.FACTORIAL.z(k));
    }
    return t;
  }
}
