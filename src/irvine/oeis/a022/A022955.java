package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022955 Unique increasing sequence satisfying a(n) = a(n-3) + c(n-3); where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022955 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.ONE;
  private Z mPrev1 = null;
  private Z mPrev2 = null;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.ONE);
    } else if (mPrev1 == null) {
      mPrev1 = mA;
      mA = Z.TWO;
    } else if (mPrev2 == null) {
      mPrev2 = mPrev1;
      mPrev1 = mA;
      mA = Z.THREE;
    } else {
      do {
        mC = mC.add(1);
      } while (mSeen.contains(mC));
      final Z t = mPrev2.add(mC);
      mPrev2 = mPrev1;
      mPrev1 = mA;
      mA = t;
    }
    mSeen.add(mA);
    return mA;
  }
}
