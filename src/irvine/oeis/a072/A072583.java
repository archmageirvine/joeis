package irvine.oeis.a072;
// Generated by gen_seq4.pl nthprimf 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A072583 Numbers n with property that there is no match when comparing the 0's and the 1's of n and the n-th prime in their binary representations.
 * @author Georg Fischer
 */
public class A072583 extends A000040 {
  protected long mK = 0;
  protected Z mNP = null;

  protected boolean isOk() {
    final int p0 = ZUtils.digitCounts(mNP, 2)[0];
    final int p1 = ZUtils.digitCounts(mNP, 2)[1];
    final int k0 = ZUtils.digitCounts(Z.valueOf(mK), 2)[0];
    final int k1 = ZUtils.digitCounts(Z.valueOf(mK), 2)[1];
    return p0 != k0 && p0 != k1 && p1 != k0 && p1 != k1;
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
