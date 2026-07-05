package irvine.oeis.a085;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A085681 Integers of the form 2^n*p where p is a prime &gt; 2^n.
 * @author Sean A. Irvine
 */
public class A085681 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeMap<Z, Pair<Long, Long>> mA = new TreeMap<>();
  {
    mA.put(Z.SIX, new Pair<>(1L, 3L));
  }

  @Override
  public Z next() {
    final Map.Entry<Z, Pair<Long, Long>> e = mA.pollFirstEntry();
    final Z k = e.getKey();
    final Pair<Long, Long> v = e.getValue();
    final long p = v.right();
    final long q = mPrime.nextPrime(p);
    final long t = v.left();
    mA.put(Z.valueOf(q).shiftLeft(t), new Pair<>(t, q));
    if (1L << (t + 1) <= p) {
      mA.put(k.multiply2(), new Pair<>(t + 1, p));
    }
    return k;
  }
}
