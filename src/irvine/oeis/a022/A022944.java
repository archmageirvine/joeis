package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022944 a(n) = a(n-2) + c(n-1) for n &gt;= 3, a( ) increasing, given a(1)=2, a(2)=4; where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022944 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.TWO;
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.TWO);
    } else if (mPrev == null) {
      mPrev = mA;
      mA = Z.FOUR;
      mSeen.add(Z.ONE);
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
