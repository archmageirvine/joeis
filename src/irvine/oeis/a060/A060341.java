package irvine.oeis.a060;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060341 Non-adding primes: next term is smallest prime not the sum of any primes so far.
 * @author Sean A. Irvine
 */
public class A060341 extends A000040 {

  private final HashSet<Z> mForbidden = new HashSet<>();

  {
    setOffset(2);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
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
