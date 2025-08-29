package irvine.oeis.a079;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079848 Smallest primes such that a(j) - a(k) are all different.
 * @author Sean A. Irvine
 */
public class A079848 extends A000040 {

  private final HashSet<Z> mA = new HashSet<>();
  private final HashSet<Z> mDiffs = new HashSet<>();

  private boolean isOk(final Z p) {
    for (final Z t : mA) {
      if (mDiffs.contains(p.subtract(t))) {
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

