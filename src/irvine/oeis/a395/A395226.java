package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395226 a(n) = number of 4-tuples (w, x, y, z) such that w*x + y*z = n, where w, x, y, z are positive Fibonacci numbers satisfying w &lt;= x and y &lt;= z.
 * @author Sean A. Irvine
 */
public class A395226 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 2;

  @Override
  public Z next() {
    ++mN;
    if (Functions.FIBONACCI.l(mM) == mN) {
      // We use (w,x,y,mM) as indices of the Fibonacci numbers
      for (long y = 2; y <= mM; ++y) {
        final long u = Functions.FIBONACCI.l(y) * mN;
        for (long x = 2; x <= mM; ++x) {
          final long fx = Functions.FIBONACCI.l(x);
          for (long w = 2; w <= x; ++w) {
            mCounts.add(Functions.FIBONACCI.l(w) * fx + u, x == mM ? 1 : 2);
          }
        }
      }
      ++mM;
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
