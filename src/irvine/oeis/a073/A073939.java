package irvine.oeis.a073;

import java.util.HashMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a078.A078142;

/**
 * A073939 Least m such that A078142(m) gives the n-th prime, where A078142(n) is the sum of the differences of the distinct prime factors p of n and the next square larger than p.
 * @author Sean A. Irvine
 */
public class A073939 extends A078142 {

  private final HashMap<Long, Long> mFirsts = new HashMap<>();
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (!mFirsts.containsKey(mP)) {
      ++mN;
      final long v = super.next().longValueExact();
      mFirsts.putIfAbsent(v, mN);
    }
    return Z.valueOf(mFirsts.remove(mP));
  }
}

