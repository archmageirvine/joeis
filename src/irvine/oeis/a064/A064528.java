package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A064528 Positive numbers that do not appear in A064520.
 * @author Sean A. Irvine
 */
public class A064528 extends A064520 {

  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mN = 0;
  private long mE = 1;
  private long mExpected = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mExpected <= mN) {
        final Z t = super.next();
        if (t.signum() > 0) {
          final long tt = t.longValueExact();
          mSeen.add(tt);
          if (tt < mN) {
            throw new RuntimeException("Previously output " + tt + " was incorrect");
          }
          if (mExpected == tt) {
            mExpected = ++mE * mE;
          }
        }
      }
      if (!mSeen.remove(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

