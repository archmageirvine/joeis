package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060433 a(n) is the smallest odd number that can be represented as the sum of one or more consecutive primes in n ways.
 * @author Sean A. Irvine
 */
public class A060433 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private void add(final TreeMap<Long, List<Long>> state, final long sum, final long p) {
    final List<Long> lst = state.get(sum);
    if (lst != null) {
      lst.add(p);
    } else {
      final ArrayList<Long> l = new ArrayList<>();
      l.add(p);
      state.put(sum, l);
    }
  }

  @Override
  public Z next() {
    ++mN;
    final TreeMap<Long, List<Long>> state = new TreeMap<>();
    add(state, 2, 2);
    long p = 3;
    while (true) {
      if (p <= state.firstKey()) {
        add(state, p, p);
        p = mPrime.nextPrime(p);
      }
      final Map.Entry<Long, List<Long>> t = state.pollFirstEntry();
      final long sum = t.getKey();
      for (final long v : t.getValue()) {
        final long u = mPrime.nextPrime(v);
        add(state, sum + u, u);
      }
      if ((sum & 1) == 1 && t.getValue().size() == mN) {
        return Z.valueOf(sum);
      }
    }
  }
}

