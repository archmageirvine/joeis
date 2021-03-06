package irvine.oeis.a072;
// Generated by gen_seq4.pl nthprimf 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A072577 Numbers n such that n and the n-th prime have the same number of 0's in their binary representation.
 * @author Georg Fischer
 */
public class A072577 extends A000040 {
  protected long mK = 0;
  protected Z mNP = null;

  protected boolean isOk() {
    return ZUtils.digitCounts(Z.valueOf(mK), 2)[0] == ZUtils.digitCounts(mNP, 2)[0];
  }

  @Override
  public Z next() {
    ++mK;
    mNP = super.next();
    while (!isOk()) {
      ++mK;
      mNP = super.next();
    }
    return Z.valueOf(mK);
  }
}
