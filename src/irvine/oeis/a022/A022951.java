package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022951 a(n) = a(n-1) + c(n) for n &gt;= 3, a( ) increasing, given a(1)=2, a(2)=3; where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022951 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.TWO);
    } else if (mSeen.size() == 1) {
      mA = Z.THREE;
      mSeen.add(Z.ONE);
      mSeen.add(Z.FOUR);
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
