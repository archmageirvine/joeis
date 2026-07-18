package irvine.oeis.a085;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A085962 Numerators of Farey fractions with prime numerators and denominators.
 * @author Sean A. Irvine
 */
public class A085962 extends Sequence3 {

  // Actually this is only done for rows of prime order

  private long mN = 2;
  private final Fast mPrime = new Fast();
  private final TreeSet<Q> mA = new TreeSet<>();

  private void farey(final long n) {
    for (long x = 2; x <= n; x = mPrime.nextPrime(x)) {
      for (long y = x; y <= n; y = mPrime.nextPrime(y)) {
        final Q v = new Q(x, y);
        if (v.compareTo(Q.ONE) < 0) {
          mA.add(v);
        }
      }
    }
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mN = mPrime.nextPrime(mN);
      farey(mN);
    }
    return select(mA.pollFirst());
  }
}
