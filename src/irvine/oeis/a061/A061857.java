package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061857 Triangle in which the k-th item in the n-th row (both starting from 1) is the number of ways in which we can add 2 distinct integers from 1 to n in such a way that the sum is divisible by k.
 * @author Sean A. Irvine
 */
public class A061857 extends Sequence1 {

  // After Robert Israel

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final long b = (mN + 1) % mM;
    final long q = (mN + 1 - b) / mM;
    final long c = mM & 1;
    if (b == 0 || b == 1) {
      return Z.valueOf((q * q * mM + c * q) / 2 + q * b - 2 * q - b + 1);
    } else if (b >= (mM + 3) / 2) {
      return Z.valueOf((q * q * mM - mM + c * (q + 1)) / 2 + q * b - 2 * q + b - 1);
    } else {
      return Z.valueOf((q * q * mM + c * q) / 2 + q * b - 2 * q);
    }
  }
}
