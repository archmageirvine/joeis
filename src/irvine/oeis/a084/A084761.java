package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084761 A sequence of primes such that (a(n)-a(n-1)) / (a(n-1)-a(n-2)) is a unique integer.
 * @author Sean A. Irvine
 */
public class A084761 extends Sequence1 {

  private final HashSet<Long> mSeen = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return mA;
      }
      mB = Z.THREE;
      return mB;
    }
    final Z d = mB.subtract(mA);
    // numerator needs to be a multiple of d
    long k = 0;
    Z t = Z.ZERO;
    while (true) {
      ++k;
      t = t.add(d);
      final Z u = t.add(mB);
      if (u.isProbablePrime() && mSeen.add(k)) {
        mA = mB;
        mB = u;
        return u;
      }
    }
  }
}
