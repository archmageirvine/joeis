package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004400 a(n) = 1 + Sum_{k=0..n} 2^k*k!.
 * @author Sean A. Irvine
 */
public class A004400 extends AbstractSequence {

  /** Construct the sequence. */
  public A004400() {
    super(-1);
  }

  private Z mF = Z.ONE;
  private Z mSum = Z.ONE;
  private long mN = -2;

  @Override
  public Z next() {
    if (++mN >= 1) {
      mF = mF.multiply(2 * mN);
    }
    if (mN >= 0) {
      mSum = mSum.add(mF);
    }
    return mSum;
  }
}

