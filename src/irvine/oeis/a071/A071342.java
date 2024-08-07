package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005875;

/**
 * A071342 a(n) = the maximum number of lattice points touched by an origin-centered sphere with radius &lt;= n.
 * @author Sean A. Irvine
 */
public class A071342 extends Sequence1 {

  private final Sequence mSeq = new A005875();
  private Z mMax = Z.ZERO;
  private long mN = 0;
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

