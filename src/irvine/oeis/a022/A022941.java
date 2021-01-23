package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022941 a(n) = a(n-1) + c(n-2) for n &gt;= 3, a( ) increasing, given a(1)=1, a(2)=2; where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022941 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.ONE);
    } else if (mSeen.size() == 1) {
      mA = Z.TWO;
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
