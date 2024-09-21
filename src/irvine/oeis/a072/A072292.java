package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001597;

/**
 * A072292 Number of proper powers b^d &lt;= n (b &gt; 1, d &gt; 1).
 * @author Sean A. Irvine
 */
public class A072292 extends Sequence1 {

  private final Sequence mSeq = new A001597().skip();
  private Z mA = mSeq.next();
  private Z mN = Z.ZERO;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mA)) {
      mCount = mCount.add(1);
      mA = mSeq.next();
    }
    return mCount;
  }
}
