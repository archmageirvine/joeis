package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022940 <code>a(n) = a(n-1) + b(n-2)</code> for <code>n &gt;= 3, a( )</code> increasing, given <code>a(1) = 1, a(2) = 3</code>; where <code>b( )</code> is complement of <code>a( )</code>.
 * @author Sean A. Irvine
 */
public class A022940 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.ONE);
    } else if (mSeen.size() == 1) {
      mA = Z.THREE;
    } else {
      do {
        mC = mC.add(1);
      } while (mSeen.contains(mC));
      mA = mA.add(mC);
    }
    mSeen.add(mA);
    return mA;
  }
}
