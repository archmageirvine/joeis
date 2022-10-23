package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022942 a(n) = a(n-2) + c(n-1) for n &gt;= 3, a( ) increasing, given a(1)=1, a(2)=2; where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022942 extends Sequence1 {

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
      mSeen.add(Z.THREE);
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
