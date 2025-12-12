package irvine.oeis.a391;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391106 allocated for Tamas Sandor Nagy.
 * @author Sean A. Irvine
 */
public class A391106 extends Sequence1 {

  private final HashMap<Long, LinkedList<Long>> mSources = new HashMap<>();
  private final HashMap<Long, Integer> mCounts = new HashMap<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;

  private LinkedList<Long> sources(final long p) {
    final LinkedList<Long> sources = mSources.get(p);
    if (sources != null) {
      return sources;
    }
    final LinkedList<Long> res = new LinkedList<>();
    mSources.put(p, res);
    return res;
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final FactorSequence fs = Jaguar.factor(++mN);
      for (final Z pp : fs.toZArray()) {
        final long p = pp.longValue();
        final int e = fs.getExponent(pp);
        // Look for reusable factors
        final LinkedList<Long> reuse = mSources.get(p);
        if (reuse != null) {
          for (int k = 0; k < e && !reuse.isEmpty(); ++k) {
            final long v = reuse.pollFirst();
            final int cnt = mCounts.merge(v, -1, Integer::sum);
            if (cnt == 0) {
              // All factors of v have now been used
              mA.add(Z.valueOf(v));
              mCounts.remove(v);
            }
          }
        }
      }
      // Update available factors for mN
      mCounts.put(mN, (int) fs.bigOmega());
      for (final Z pp : fs.toZArray()) {
        final long p = pp.longValue();
        final int e = fs.getExponent(pp);
        final LinkedList<Long> sources = sources(p);
        for (int k = 0; k < e; ++k) {
          sources.add(mN);
        }
      }
    }
    return mA.pollFirst();
  }
}
