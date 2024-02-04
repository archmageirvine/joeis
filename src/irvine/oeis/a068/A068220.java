package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a001.A001097;

/**
 * A067845.
 * @author Sean A. Irvine
 */
public class A068220 extends A001097 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;

  private boolean is(final Z p) {
    // p already a twin
    final Z q = mPrime.nextPrime(p.add(2));
    if (!q.add(2).isProbablePrime()) {
      return false;
    }
    final Z r = mPrime.nextPrime(q.add(2));
    if (!r.add(2).isProbablePrime()) {
      return false;
    }
    final Z s = mPrime.nextPrime(r.add(2));
    return s.add(2).isProbablePrime();
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      Z p = super.next();
      if (p.compareTo(mPrev) > 0 && is(p)) {
        do {
          mA.add(p);
          mA.add(p.add(2));
          p = mPrime.nextPrime(p.add(2));
        } while (p.add(2).isProbablePrime());
      }
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
