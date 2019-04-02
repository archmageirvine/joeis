package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * A048211 Number of distinct resistances that can be produced from a circuit of n equal resistors using only series and parallel combinations.
 * @author Sean A. Irvine
 */
public class A048211 implements Sequence {

  protected final ArrayList<Set<Pair<Long, Long>>> mKnown = new ArrayList<>();

  private Pair<Long, Long> series(final Pair<Long, Long> x, final Pair<Long, Long> y) {
    // compute x + y
    final long a = x.left();
    final long b = x.right();
    final long c = y.left();
    final long d = y.right();
    final long e = a * d + b * c;
    final long f = b * d;
    final long g = LongUtils.gcd(e, f);
    return new Pair<>(e / g, f / g);
  }

  private Pair<Long, Long> parallel(final Pair<Long, Long> x, final Pair<Long, Long> y) {
    // compute 1/(1/x + 1/y)
    final long a = x.left();
    final long b = x.right();
    final long c = y.left();
    final long d = y.right();
    final long e = b * c + a * d;
    final long f = a * c;
    final long g = LongUtils.gcd(e, f);
    return new Pair<>(f / g, e / g);
  }

  @Override
  public Z next() {
    final int n = mKnown.size();
    if (n == 0) {
      mKnown.add(Collections.singleton(new Pair<>(1L, 1L)));
    } else {
      final HashSet<Pair<Long, Long>> seen = new HashSet<>();
      for (int k = 0; k <= n / 2; ++k) {
        for (final Pair<Long, Long> f : mKnown.get(k)) {
          for (final Pair<Long, Long> e : mKnown.get(n - k - 1)) {
            seen.add(series(e, f));
            seen.add(parallel(e, f));
          }
        }
      }
      mKnown.add(seen);
    }
    return Z.valueOf(mKnown.get(n).size());
  }
}

