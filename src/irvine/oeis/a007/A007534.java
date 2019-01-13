package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A007534.
 * @author Sean A. Irvine
 */
public class A007534 extends A001359 {

  // This sequence is likely finite, but this is a proper implementation

  private final TreeSet<Long> mForbidden = new TreeSet<>();
  private long mN = 0;
  private long mP = 0;

  private void updateForbidden(final long p) {
    final A001359 a = new A001359();
    long q;
    while ((q = a.next().longValueExact()) <= p) {
      final long s = p + q;
      if (s >= mN) {
        mForbidden.add(s);
        mForbidden.add(s + 2);
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      while (mP < mN) {
        mP = super.next().longValueExact();
        updateForbidden(mP);
        updateForbidden(mP + 2);
      }
      if (!mForbidden.remove(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
