package irvine.oeis.a064;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A064224 Numbers having more than one representation as the product of consecutive integers &gt; 1.
 * @author Sean A. Irvine
 */
public class A064224 extends Sequence1 {

  // After Michael S. Branicky

  private static class State implements Comparable<State> {
    private final Z mV;
    private final long mS;
    private final long mL;

    private State(final Z v, final long s, final long l) {
      mV = v;
      mS = s;
      mL = l;
    }

    @Override
    public int compareTo(final State state) {
      final int c = mV.compareTo(state.mV);
      if (c != 0) {
        return c;
      }
      final int d = Long.compare(mS, state.mS);
      if (d != 0) {
        return d;
      }
      return Long.compare(mL, state.mL);
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<State> mHeap = new TreeSet<>();
  private Z mP = Z.SIX;
  private long mNextCount = 4;
  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mOldV = null;
  {
    mHeap.add(new State(mP, 2, 3));
  }

  @Override
  public Z next() {
    long oldS = 0;
    long oldL = 0;
    Z res = null;
    while (true) {
      final State t = mHeap.pollFirst();
      final Z v = t.mV;
      long s = t.mS;
      long l = t.mL;
      if (v.equals(mOldV) && mSeen.add(v)) {
        res = v;
        if (mVerbose) {
          StringUtils.message(v + " = Prod_{k=" + s + ".." + l + "} k = Prod_{k=" + oldS + ".." + oldL + "} k");
        }
      }
      if (v.compareTo(mP) >= 0) {
        mP = mP.multiply(mNextCount);
        mHeap.add(new State(mP, 2, mNextCount));
        ++mNextCount;
      }
      mOldV = v;
      oldS = s;
      oldL = l;
      mHeap.add(new State(v.divide(s++).multiply(++l), s, l));
      if (res != null) {
        return res;
      }
    }
  }
}
