package irvine.oeis.a364;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A364242 a(n) is the smallest positive integer such that a(n) and a(n)+2 are both products of n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A364242 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    // All terms will be odd, hence can assume the least prime factor is 3
    final long[] s = new long[++mN];
    long p = 2;
    Z prod = Z.ONE;
    for (int k = 0; k < s.length; ++k) {
      p = mPrime.nextPrime(p);
      s[k] = p;
      prod = prod.multiply(p);
    }
    final TreeMap<Z, long[]> state = new TreeMap<>();
    state.put(prod, s);
    while (true) {
      final Map.Entry<Z, long[]> e = state.pollFirstEntry();
      final Z m = e.getKey();
      final long[] v = e.getValue();
      final long nextPrime = mPrime.nextPrime(Functions.MAX.l(v));
      final Z nextValue = m.multiply(nextPrime);
      for (int k = 0; k < v.length; ++k) {
        final long oldPrime = v[k];
        final long[] copy = Arrays.copyOf(v, v.length);
        copy[k] = nextPrime;
        state.put(nextValue.divide(oldPrime), copy);
      }
      if (state.containsKey(m.add(2))) {
        return m;
      }
    }
  }
}
