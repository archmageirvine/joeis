package irvine.oeis.a028;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028689 Sorted Galois numbers.
 * @author Sean A. Irvine
 */
public class A028689 extends Sequence1 {

  private final TreeSet<Z> mQueue = new TreeSet<>();
  private final Map<Long, Z> mGalois = new HashMap<>();
  private final Map<Long, Integer> mIndices = new HashMap<>();
  private final Fast mPrime = new Fast();
  {
    mQueue.add(Z.ONE);
  }

  static Z galois(final long p, final int n) {
    final Z pn = Z.valueOf(p).pow(n);
    Z prod = pn;
    Z pk = Z.ONE;
    for (int k = 0; k < n; ++k, pk = pk.multiply(p)) {
      prod = prod.multiply(pn.subtract(pk));
    }
    return prod;
  }

  @Override
  public Z next() {
    final Z res = mQueue.pollFirst();
    long p = 2;
    while (mQueue.isEmpty() || Z.valueOf(p).square().subtract(p).compareTo(mQueue.first()) <= 0) {
      final int e = mIndices.getOrDefault(p, 0);
      if (e == 0) {
        mIndices.put(p, 1);
        final Z v = galois(p, 1);
        mGalois.put(p, v);
        mQueue.add(v);
      } else if (mGalois.get(p).compareTo(res) <= 0) {
        mIndices.put(p, e + 1);
        final Z v = galois(p, e + 1);
        mGalois.put(p, v);
        mQueue.add(v);
      }
      p = mPrime.nextPrime(p);
    }
    return res;
  }
}
