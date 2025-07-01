package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385202 Irregular triangle read by rows: let S be an ordered set of nondivisors of n such that a and b belong to S if a + b = n. T(n,k) is the k-th member of S. If S is empty, T(n,k) = 0.
 * @author Sean A. Irvine
 */
public class A385202 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private boolean mForcedZero = false;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 1;
        if (mForcedZero) {
          return Z.ZERO;
        }
        mForcedZero = true;
      }
      if (mN % mM != 0) {
        final long r = mN - mM % mN;
        if (mN % r != 0) {
          mForcedZero = false;
          return Z.valueOf(mM);
        }
      }
    }
  }
}

