package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000118;

/**
 * A071337.
 * @author Sean A. Irvine
 */
public class A071345 extends Sequence1 {

  private final Sequence mSeq = new A000118();
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

