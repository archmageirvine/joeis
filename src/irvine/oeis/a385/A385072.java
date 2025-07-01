package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000217;
import irvine.oeis.a000.A000292;

/**
 * A385072 a(n) = number of tetrahedral numbers &lt;= n-th triangular number.
 * @author Sean A. Irvine
 */
public class A385072 extends Sequence0 {

  private final Sequence mTri = new A000217();
  private final Sequence mTetra = new A000292();
  private Z mB = mTetra.next();
  private long mCnt = 0;

  @Override
  public Z next() {
    final Z t = mTri.next();
    while (mB.compareTo(t) <= 0) {
      ++mCnt;
      mB = mTetra.next();
    }
    return Z.valueOf(mCnt);
  }
}
