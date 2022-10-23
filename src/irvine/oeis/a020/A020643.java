package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A020643 a(n)-th squarefree is sum of first k squarefrees for some k.
 * @author Sean A. Irvine
 */
public class A020643 extends Sequence1 {

  private final A005117 mCSeq = new A005117();
  private final A005117 mDSeq = new A005117();
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
