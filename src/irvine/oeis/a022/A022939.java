package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022939 Unique increasing sequence satisfying a(n) = a(n-2) + c(n-2); where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022939 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.ONE;
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.ONE);
    } else if (mPrev == null) {
      mPrev = mA;
      mA = Z.TWO;
    } else {
      do {
        mC = mC.add(1);
      } while (mSeen.contains(mC));
      final Z t = mPrev.add(mC);
      mPrev = mA;
      mA = t;
    }
    mSeen.add(mA);
    return mA;
  }
}
