package irvine.oeis.a084;

import java.util.HashMap;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002233;

/**
 * A084735 Let p = n-th prime, let q = smallest prime having p as its least prime primitive root; sequence gives least (not necessarily prime) primitive root of q.
 * @author Sean A. Irvine
 */
public class A084735 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mS = 1;
  private final HashMap<Long, Long> mLeast = new HashMap<>();
  private final A002233 mA = new A002233();

  private long least(final long p) {
    while (!mLeast.containsKey(p)) {
      mS = mPrime.nextPrime(mS);
      final long q = mA.next().longValueExact();
      mLeast.putIfAbsent(q, mS);
    }
    return mLeast.get(p);
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long q = least(mP);
    return Functions.LEAST_PRIMITIVE_ROOT.z(q);
  }
}
