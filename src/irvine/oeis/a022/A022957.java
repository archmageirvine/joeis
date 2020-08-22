package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022957 Unique increasing sequence satisfying a(n) = a(n-5) + c(n-5); where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022957 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.ONE;
  private Z mPrev1 = null;
  private Z mPrev2 = null;
  private Z mPrev3 = null;
  private Z mPrev4 = null;

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
    } else if (mPrev4 == null) {
      mPrev4 = mPrev3;
      mPrev3 = mPrev2;
      mPrev2 = mPrev1;
      mPrev1 = mA;
      mA = Z.FIVE;
    } else {
      do {
        mC = mC.add(1);
      } while (mSeen.contains(mC));
      final Z t = mPrev4.add(mC);
      mPrev4 = mPrev3;
      mPrev3 = mPrev2;
      mPrev2 = mPrev1;
      mPrev1 = mA;
      mA = t;
    }
    mSeen.add(mA);
    return mA;
  }
}
