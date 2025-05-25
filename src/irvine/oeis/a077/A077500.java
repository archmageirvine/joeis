package irvine.oeis.a077;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003596 Numbers of the form 2^i * 11^j.
 * @author Sean A. Irvine
 */
public class A077500 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeMap<Z, Long> mPriority = new TreeMap<>();
  private long mP = 1;

  @Override
  public Z next() {
    if (mP == 1) {
      mP = 2;
      return Z.TWO;
    }
    while (true) {
      if (mPriority.isEmpty() || mPriority.firstKey().compareTo(mP) > 0) {
        mPriority.put(Z.valueOf(mP), mP);
        mP = mPrime.nextPrime(mP);
      }
      final Map.Entry<Z, Long> r = mPriority.pollFirstEntry();
      final Z n = r.getKey();
      final long p = r.getValue();
      mPriority.put(n.multiply2(), p);
      mPriority.put(n.multiply(p), p);
      if (n.add(1).isProbablePrime()) {
        return n.add(1);
      }
    }
  }
}
