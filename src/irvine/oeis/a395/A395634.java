package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395634 a(n) = number of triples (x, y, z) such that 2*x^2 + y*z = n, where x, y, z are positive integers with x coprime to y*z.
 * @author Sean A. Irvine
 */
public class A395634 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    // z = mN
    for (long y = 1; y <= mN; ++y) {
      for (long x = 1; x <= mN; ++x) {
        if (Functions.GCD.l(x, y * mN) == 1) {
          mCounts.add(2 * x * x + y * mN, y == mN ? 1 : 2);
        }
      }
    }
    // x = mN
    if (mN > 1) {
      for (long y = 1; y < mN; ++y) {
        for (long z = 1; z <= y; ++z) {
          if (Functions.GCD.l(mN, y * z) == 1) {
            mCounts.add(2 * mN * mN + y * z, y == z ? 1 : 2);
          }
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
