package irvine.oeis.a028;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028311 Odd numbers n such that <code>{1..n-1}</code> can be partitioned into disjoint sets I, J with <code>2I = -J (mod n)</code> such that I, J are unions of cyclotomic cosets <code>mod n</code>.
 * @author Sean A. Irvine
 */
public class A028311 implements Sequence {

  // Could be done with the Group framework
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  protected int mN = 1;

  protected List<BitSet> cosets(final int n) {
    final boolean[] used = new boolean[n];
    final ArrayList<BitSet> cosets = new ArrayList<>();
    for (int start = 1; start < n; ++start) {
      if (!used[start]) {
        final BitSet set = new BitSet(n);
        cosets.add(set);
        int e = start;
        do {
          used[e] = true;
          set.set(e);
          e = (4 * e) % n;
        } while (!used[e]);
      }
    }
    return cosets;
  }

  private BitSet negate(final BitSet set, final int n) {
    final BitSet res = new BitSet(n);
    for (int s = set.nextSetBit(0); s >= 0; s = set.nextSetBit(s + 1)) {
      res.set(n - s);
    }
    return res;
  }

  private BitSet multiply2(final BitSet set, final int n) {
    final BitSet res = new BitSet(n);
    for (int s = set.nextSetBit(0); s >= 0; s = set.nextSetBit(s + 1)) {
      final int t = 2 * s;
      res.set(t >= n ? t - n : t); // (2 * s) % n
    }
    return res;
  }

  private BitSet union(final List<BitSet> cosets, long s) {
    final BitSet res = new BitSet(mN);
    int k = 0;
    while (s != 0) {
      if ((s & 1) == 1) {
        res.or(cosets.get(k));
      }
      ++k;
      s >>>= 1;
    }
    return res;
  }

  private BitSet union(final BitSet a, final BitSet b) {
    final BitSet union = new BitSet(mN);
    union.or(a);
    union.or(b);
    return union;
  }

  protected boolean isA028311(final List<BitSet> cosets) {
    if (mVerbose) {
      StringUtils.message("n=" + mN + " #cosets=" + cosets.size());
    }
    // Do as triangle, to reduce number of unions that need to be recomputed
    for (long i = 1; i < 1L << cosets.size(); ++i) {
      final BitSet setI = union(cosets, i);
      final BitSet setINegate = negate(setI, mN);
      final BitSet setIMul2 = multiply2(setI, mN);
      for (long j = 1; j < i; ++j) {
        final BitSet setJ = union(cosets, j);
        if (setI.cardinality() == setJ.cardinality()
          && !setI.intersects(setJ)
          && union(setI, setJ).cardinality() == mN - 1
          && (setIMul2.equals(negate(setJ, mN)) || multiply2(setJ, mN).equals(setINegate))) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final List<BitSet> cosets = cosets(mN);
      if (isA028311(cosets)) {
        return Z.valueOf(mN);
      }
    }
  }
}
