package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395012 allocated for Lei Zhou.
 * @author Sean A. Irvine
 */
public class A395012 extends Sequence1 {

  private int mN = 0;
  private final List<Long> mPs = new ArrayList<>();
  private long mScan = 4;
  {
    mPs.add(2L);
    mPs.add(3L);
  }
  private int mSafePrefix = 0;

  private void step() {
    mScan += 2;
    // Build pn = primes in (n - ps)
    final List<Long> pn = new ArrayList<>();
    for (final long p : mPs) {
      final long candidate = mScan - p;
      if (Predicates.PRIME.is(candidate)) {
        pn.add(candidate);
      }
    }

    // Compute intersection
    final HashSet<Long> set = new HashSet<>(mPs);
    int ct = 0;
    for (final long x : pn) {
      if (set.contains(x)) {
        ++ct;
      }
    }

    if (ct == 0 && !pn.isEmpty()) {
      final long p = pn.stream().mapToLong(Long::longValue).max().getAsLong();
      // delete > p
      mPs.removeIf(x -> x > p);
      mPs.add(p);
      // reset scan position
      mScan = mPs.get(mPs.size() - 1) + 1;
    }
  }

  @Override
  public Z next() {
    ++mN;
    final int requiredFullSize = (int) Math.ceil(mN / 0.70);
    // Grow incrementally
    while (mPs.size() < requiredFullSize) {
      step();
    }
    final int currentSafe = (int) Math.floor(mPs.size() * 0.70);
    if (currentSafe < mSafePrefix) {
      throw new RuntimeException("Rollback invalidated previously emitted terms");
    }
    mSafePrefix = currentSafe;
    return Z.valueOf(mPs.get(mN - 1));
  }
}
