package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004018;

/**
 * A071339 a(n) = the maximum number of lattice points touched by an origin-centered circle with radius &lt;= n.
 * @author Sean A. Irvine
 */
public class A071339 extends Sequence0 {

  private final Sequence mSeq = new A004018();
  private Z mMax = Z.ZERO;
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM <= mN * mN) {
      mMax = mMax.max(mSeq.next());
      ++mM;
    }
    return mMax;
  }
}

