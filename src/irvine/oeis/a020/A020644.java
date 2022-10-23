package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a013.A013929;

/**
 * A020644 a(n)-th nonsquarefree is sum of first k nonsquarefrees for some k.
 * @author Sean A. Irvine
 */
public class A020644 extends Sequence1 {

  private final A013929 mCSeq = new A013929();
  private final A013929 mDSeq = new A013929();
  private Z mA = Z.ZERO;
  private Z mD = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(mCSeq.next());
      while (mD.compareTo(mA) < 0) {
        mD = mDSeq.next();
        ++mN;
      }
      if (mD.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
