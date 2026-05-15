package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395633 a(n) = number of triples (x, y, z) such that 2*x^2 + y*z = n, where x, y, z are positive integers satisfying y &lt; x &lt; z.
 * @author Sean A. Irvine
 */
public class A395633 extends AbstractSequence {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;

  /** Construct the sequence. */
  public A395633() {
    super(11);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      // z = mN
      for (long x = 1; x < mN; ++x) {
        for (long y = 1; y < x; ++y) {
          mCounts.increment(2 * x * x + y * mN);
        }
      }
      if (mN >= 11) {
        return Z.valueOf(mCounts.get(mN));
      }
    }
  }
}
