package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395228 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395228 extends AbstractSequence {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 4;
  private long mM = 5;

  /** Construct the sequence. */
  public A395228() {
    super(17);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.FIBONACCI.l(mM) == mN) {
        // We use (w,x,y,mM) as indices of the Fibonacci numbers
        for (long y = 4; y < mM; ++y) {
          final long u = Functions.FIBONACCI.l(y) * mN;
          for (long x = 3; x < y; ++x) {
            final long fx = Functions.FIBONACCI.l(x);
            for (long w = 2; w < x; ++w) {
              mCounts.increment(Functions.FIBONACCI.l(w) * fx + u);
            }
          }
        }
        ++mM;
      }
      if (mN >= 17) {
        return Z.valueOf(mCounts.get(mN));
      }
    }
  }
}
