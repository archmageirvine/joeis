package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022935 <code>a(n) = a(n-1) + c(n-1)</code> for <code>n &gt;= 2, a( )</code> increasing, given <code>a(1)=3</code>, where <code>c( )</code> is complement of <code>a( )</code>.
 * @author Sean A. Irvine
 */
public class A022935 implements Sequence {

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
