package irvine.oeis.a020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020498 a(n) is the least number &gt; a(n-1) such that there is no prime p for which a(1) through a(n) would contain all residues modulo p.
 * @author Sean A. Irvine
 */
public class A020498 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Map<Long, Set<Long>> mSeenResidues = new HashMap<>();
  private final List<Long> mSeq = new ArrayList<>();
  private long mA = 0;

  private boolean isOk(final long n) {
    for (final Map.Entry<Long, Set<Long>> e : mSeenResidues.entrySet()) {
      final long p = e.getKey();
      final Set<Long> r = e.getValue();
      if (r.size() + 1 == p && !r.contains(n % p)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mA)) {
        final HashSet<Long> s = new HashSet<>(mSeq); // preload with sequence so far
        mSeenResidues.put(mA, s);
      }
      if (isOk(mA)) {
        for (final Map.Entry<Long, Set<Long>> e : mSeenResidues.entrySet()) {
          final long p = e.getKey();
          e.getValue().add(mA % p);
        }
        mSeq.add(mA);
        return Z.valueOf(mA);
      }
    }
  }
}
