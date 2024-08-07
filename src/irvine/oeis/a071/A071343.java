package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005875;

/**
 * A071343 a(n) = least positive r &lt;= n, such that the origin-centered sphere of radius sqrt(r) touches A071342(n) lattice points.
 * @author Sean A. Irvine
 */
public class A071343 extends Sequence1 {

  private final Sequence mSeq = new A005875();
  private Z mMax = Z.ZERO;
  private long mBest = 0;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM <= mN * mN) {
      final Z t = mSeq.next();
      if (t.compareTo(mMax) > 0) {
        mBest = mM;
        mMax = t;
      }
      ++mM;
    }
    return Z.valueOf(mBest);
  }
}

