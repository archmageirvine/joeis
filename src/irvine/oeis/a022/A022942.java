package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022942 <code>a(n) = a(n-2) + c(n-1)</code> for <code>n &gt;= 3, a( )</code> increasing, given <code>a(1)=1, a(2)=2;</code> where <code>c( )</code> is complement of <code>a( )</code>.
 * @author Sean A. Irvine
 */
public class A022942 implements Sequence {

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
