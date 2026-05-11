package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084792 Primes other than those of the form prime(prime(n)+n-1).
 * @author Sean A. Irvine
 */
public class A084792 extends A000040 {

  private final HashSet<Long> mForbidden = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      mForbidden.add(p.add(mN).longValueExact());
      if (!mForbidden.remove(++mN)) {
        return p;
      }
    }
  }
}
