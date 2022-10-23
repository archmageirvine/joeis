package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A000705 n-th superior highly composite number A002201(n) is product of first n terms of this sequence.
 * @author Sean A. Irvine
 */
public class A000705 extends Sequence1 {

  private long mPrime = 1;
  private final Fast mP = new Fast();
  private final TreeMap<Double, Integer> mMap = new TreeMap<>();
  private final DynamicLongArray mK = new DynamicLongArray();
  private final ArrayList<Long> mPrimes = new ArrayList<>();

  @Override
  public Z next() {
    final int t = mPrimes.size();
    mPrime = mP.nextPrime(mPrime);
    mK.set(t, 1L);
    mPrimes.add(mPrime);
    mMap.put(Math.log(mPrime) / Math.log1p(1), t);
    final Map.Entry<Double, Integer> e = mMap.firstEntry();
    mMap.remove(e.getKey());
    final int n = e.getValue();
    final long k = mK.get(n) + 1;
    mK.set(n, k);
    final long p = mPrimes.get(n);
    mMap.put(Math.log(p) / Math.log1p(1.0 / k), n);
    return Z.valueOf(p);
  }

}
