package irvine.oeis.a079;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A079850 a(1) = 1 and then the smallest primes such that all a(k)-a(j) are distinct composite numbers.
 * @author Sean A. Irvine
 */
public class A079850 extends A008578 {

  private final HashSet<Z> mA = new HashSet<>();
  private final HashSet<Z> mDiffs = new HashSet<>();
  {
    mDiffs.add(Z.ONE);
  }

  private boolean isOk(final Z p) {
    for (final Z t : mA) {
      if (mDiffs.contains(p.subtract(t)) || p.subtract(t).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (isOk(p)) {
        for (final Z t : mA) {
          mDiffs.add(p.subtract(t));
        }
        mA.add(p);
        return p;
      }
    }
  }
}

