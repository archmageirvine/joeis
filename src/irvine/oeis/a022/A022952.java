package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022952 a(n) = a(n-1) + c(n) for n &gt;= 3, a( ) increasing, given a(1)=3 a(2)=6; where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022952 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.THREE;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.THREE);
    } else if (mSeen.size() == 1) {
      mA = Z.SIX;
      mSeen.add(Z.ONE);
      mSeen.add(Z.TWO);
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
