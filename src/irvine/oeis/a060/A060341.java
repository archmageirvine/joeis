package irvine.oeis.a060;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A060341 Non-adding primes: next term is smallest prime not the sum of any primes so far.
 * @author Sean A. Irvine
 */
public class A060341 extends Sequence1 {

  private final HashSet<Z> mForbidden = new HashSet<>();
  private final A000040 mPrimes = new A000040();

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrimes.next();
      if (!mForbidden.contains(p)) {
        final HashSet<Z> newForbidden = new HashSet<>();
        newForbidden.add(p);
        for (final Z q : mForbidden) {
          newForbidden.add(q.add(p));
        }
        mForbidden.addAll(newForbidden);
        return p;
      }
    }
  }
}
