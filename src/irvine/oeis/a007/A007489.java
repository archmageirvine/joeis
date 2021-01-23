package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007489 a(n) = Sum_{k=1..n} k!.
 * @author Sean A. Irvine
 */
public class A007489 implements Sequence {

  private long mN = -1;
  private Z mSum = Z.ZERO;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
      mSum = mSum.add(mF);
    }
    return mSum;
  }
}
