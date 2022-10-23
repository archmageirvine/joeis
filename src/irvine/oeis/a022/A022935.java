package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022935 a(n) = a(n-1) + c(n-1) for n &gt;= 2, a( ) increasing, given a(1)=3, where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022935 extends Sequence1 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = start();

  protected Z start() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(start());
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
