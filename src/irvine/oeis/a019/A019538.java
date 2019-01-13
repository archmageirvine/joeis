package irvine.oeis.a019;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019538.
 * @author Sean A. Irvine
 */
public class A019538 implements Sequence {

  private long mN = 0;
  private long mK = 0;
  private Z mFactorialK = Z.ONE;

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
      mFactorialK = Z.ONE;
    }
    mFactorialK = mFactorialK.multiply(mK);
    return mFactorialK.multiply(Stirling.secondKind(mN, mK));
  }
}
