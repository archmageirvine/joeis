package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004018;

/**
 * A071340 a(n) = least positive r &lt;= n such that the origin-centered circle of radius sqrt(r) touches A071339(n) lattice points.
 * @author Sean A. Irvine
 */
public class A071340 extends Sequence0 {

  private final Sequence mSeq = new A004018();
  private Z mMax = Z.ZERO;
  private long mBest = 0;
  private long mN = -1;
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

