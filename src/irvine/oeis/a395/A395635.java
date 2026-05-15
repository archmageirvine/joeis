package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395635 a(n) = number of triples (x, y, z) such that 2*x^2 + y*z = n, where x, y, z are positive integers with gcd(x,y*z)&gt;1.
 * @author Sean A. Irvine
 */
public class A395635 extends AbstractSequence {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;

  /** Construct the sequence. */
  public A395635() {
    super(10);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      // z = mN
      for (long y = 1; y <= mN; ++y) {
        for (long x = 2; x <= mN; ++x) {
          if (Functions.GCD.l(x, y * mN) > 1) {
            mCounts.add(2 * x * x + y * mN, y == mN ? 1 : 2);
          }
        }
      }
      // x = mN
      if (mN > 1) {
        for (long y = 1; y < mN; ++y) {
          for (long z = 1; z <= y; ++z) {
            if (Functions.GCD.l(mN, y * z) > 1) {
              mCounts.add(2 * mN * mN + y * z, y == z ? 1 : 2);
            }
          }
        }
      }
      if (mN >= 10) {
        return Z.valueOf(mCounts.get(mN));
      }
    }
  }
}
