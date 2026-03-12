package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A390734 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A390734 extends Sequence1 {

  // We pull a few tricks to try and coax out a little speed.
  // All sums of three terms are precomputed.

  // We compute modulo this value. Any solutions found are then checked at full precision.
  private static final long MOD = 4611686018427387847L; // prevPrime(2^62)

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final A000040 mPrime = new A000040();
  private final ArrayList<Long> mPrimes = new ArrayList<>();
  private final ArrayList<Long> mP5mod = new ArrayList<>();

  private final HashMap<Long, List<BitSet>> mThree = new HashMap<>();

  private static long modAdd(final long a, final long b) {
    final long s = a + b;
    return s >= MOD ? s - MOD : s;
  }

  private void extendThree(final int k) {
    final long pk = mP5mod.get(k);
    for (int i = 0; i < k; ++i) {
      final long si = modAdd(mP5mod.get(i), pk);
      for (int j = i + 1; j < k; ++j) {
        final long s = modAdd(si, mP5mod.get(j));
        final BitSet set = new BitSet();
        set.set(i);
        set.set(j);
        set.set(k);
        final List<BitSet> lst = mThree.get(s);
        if (lst == null) {
          final ArrayList<BitSet> sets = new ArrayList<>();
          sets.add(set);
          mThree.put(s, sets);
        } else {
          lst.add(set);
        }
      }
    }
  }

  private boolean representable(final long targetMod, final Z targetExact) {
    final int n = mPrimes.size();
    for (int i = 0; i < n; ++i) {
      final long a = mP5mod.get(i);
      for (int j = i + 1; j < n; ++j) {
        final long b = modAdd(a, mP5mod.get(j));
        for (int k = j + 1; k < n; ++k) {
          final long c = modAdd(b, mP5mod.get(k));
          for (int l = k + 1; l < n; ++l) {
            final long s4 = modAdd(c, mP5mod.get(l));
            long need = targetMod - s4;
            if (need < 0) {
              need += MOD;
            }
            final List<BitSet> lst = mThree.get(need);
            if (lst != null) {
              for (final BitSet mask3 : lst) {
                final BitSet mask4 = new BitSet();
                mask4.set(i);
                mask4.set(j);
                mask4.set(k);
                mask4.set(l);

                if (!(mask3.intersects(mask4))) {
                  if (mVerbose) {
                    StringUtils.message("Detected putative solution, doing exact check");
                  }
                  // reconstruct exact sum
                  Z sum = Z.ZERO;
                  for (int t = 0; t < n; ++t) {
                    if (mask3.get(t) || mask4.get(t)) {
                      sum = sum.add(Z.valueOf(mPrimes.get(t)).pow(5));
                    }
                  }
                  if (sum.equals(targetExact)) {
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrime.next();
      final long p5mod = p.modPow(5, MOD).longValue();
      final Z p5exact = p.pow(5);
      mPrimes.add(p.longValueExact());
      mP5mod.add(p5mod);
      extendThree(mPrimes.size() - 1);
      if (mVerbose) {
        StringUtils.message("Testing p=" + p);
      }
      // prime(267) == 1709 corresponds to smallest solution
      if (mPrimes.size() >= 267 && representable(p5mod, p5exact)) {
        return p;
      }
    }
  }
}
