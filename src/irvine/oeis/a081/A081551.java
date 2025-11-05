package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081551 Triangle, read by rows, in which the n-th row contains n smallest n-digit numbers.
 * @author Sean A. Irvine
 */
public class A081551 extends Sequence1 {

  private Z mStart = Z.ONE;
  private Z mA = Z.ZERO;
  private int mN = 1;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mStart = mStart.multiply(10);
      mA = mStart;
    } else {
      mA = mA.add(1);
    }
    return mA;
  }
}
