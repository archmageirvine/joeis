package irvine.oeis.a028;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028246.
 * @author Sean A. Irvine
 */
public class A028246 implements Sequence {

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
    final Z f = mFactorialK;
    mFactorialK = mFactorialK.multiply(mK);
    return f.multiply(Stirling.secondKind(mN, mK));
  }
}
