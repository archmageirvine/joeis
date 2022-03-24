package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A089309 Write n in binary; a(n) = length of the rightmost run of 1's.
 * a(n) = if (n==0, 0, valuation(n/2^valuation(n, 2)+1, 2));
 * @author Georg Fischer
 */
public class A089309 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A089309() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    final long v2 = ZUtils.valuation(Z.valueOf(mN), Z.TWO);
    return Z.valueOf(ZUtils.valuation(Z.valueOf(mN / (1 << v2) + 1), Z.TWO));
  }
}
