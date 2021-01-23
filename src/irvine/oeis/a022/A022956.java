package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022956 Unique increasing sequence satisfying a(n) = a(n-4) + c(n-4); where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022956 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.ONE;
  private Z mPrev1 = null;
  private Z mPrev2 = null;
  private Z mPrev3 = null;

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
    } else if (mPrev3 == null) {
      mPrev3 = mPrev2;
      mPrev2 = mPrev1;
      mPrev1 = mA;
      mA = Z.FOUR;
    } else {
      do {
        mC = mC.add(1);
      } while (mSeen.contains(mC));
      final Z t = mPrev3.add(mC);
      mPrev3 = mPrev2;
      mPrev2 = mPrev1;
      mPrev1 = mA;
      mA = t;
    }
    mSeen.add(mA);
    return mA;
  }
}
