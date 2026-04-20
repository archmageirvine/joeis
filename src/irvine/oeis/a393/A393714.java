package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A393714 a(n) = number of triples (x, y, z) such that x^2 + y*z = n, where x, y, z are positive integers and x is coprime to y*z.
 * @author Sean A. Irvine
 */
public class A393714 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long y = 1; y <= mN; ++y) {
      for (long x = 1; x <= mN; ++x) {
        if (Functions.GCD.l(x, y * mN) == 1) {
          mCounts.increment(x * x + y * mN);
        }
      }
    }
    for (long z = 1; z < mN; ++z) {
      for (long x = 1; x <= mN; ++x) {
        if (Functions.GCD.l(x, mN * z) == 1) {
          mCounts.increment(x * x + mN * z);
        }
      }
    }
    for (long y = 1; y < mN; ++y) {
      for (long z = 1; z < mN; ++z) {
        if (Functions.GCD.l(mN, y * z) == 1) {
          mCounts.increment(mN * mN + y * z);
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
