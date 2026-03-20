package irvine.oeis.a392;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392195 Positive integers with canonical prime factorization Product_{i=1..m} p_i^(p_i - p_{i-1}), where p_0 = 1.
 * @author Sean A. Irvine
 */
public class A392195 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeMap<Z, long[]> mA = new TreeMap<>();
  {
    mA.put(Z.ONE, new long[] {1});
  }

  @Override
  public Z next() {
    final Map.Entry<Z, long[]> e = mA.pollFirstEntry();
    final Z key = e.getKey();
    final long[] value = e.getValue();
    if (value.length == 1) {
      // Increase initial prime
      final long p = mPrime.nextPrime(value[0]);
      mA.put(Z.valueOf(p).pow(p - 1), new long[] {p});
    }
    final int n = value.length;
    if (value[0] != 1) {
      // Append a new prime
      final long[] v = Arrays.copyOf(value, n + 1);
      v[n] = mPrime.nextPrime(value[n - 1]);
      final Z newKey = key.multiply(Z.valueOf(v[n]).pow(v[n] - v[n - 1]));
      mA.put(newKey, v);
    }
    if (value.length > 1) {
      // Increase last prime
      final long p = mPrime.nextPrime(value[n - 1]);
      final long prev = value[n - 2];
      final Z newKey = key.divide(Z.valueOf(value[n - 1]).pow(value[n - 1] - prev)).multiply(Z.valueOf(p).pow(p - prev));
      value[n - 1] = p;
      mA.put(newKey, value);
    }
    return key;
  }
}
