package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395230 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395230 extends Sequence0 {

  // todo does not match -- name is wrong

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 2;

  @Override
  public Z next() {
    ++mN;
    if (Functions.FIBONACCI.l(mM) == mN) {
      // We use (w,x,y,mM) as indices of the Fibonacci numbers
      for (long y = 2; y < mM; ++y) {
        final long u = Functions.FIBONACCI.l(y) * mN;
        for (long x = 2; x <= mM; ++x) {
          final long fx = Functions.FIBONACCI.l(x);
          for (long w = 2; w < x; ++w) {
            final long v = Functions.FIBONACCI.l(w) * fx;
//            if (u + v == 4) {
//              System.out.println("(" + mN + "," + Functions.FIBONACCI.l(y) + "," + fx + "," + Functions.FIBONACCI.l(w) + ")");
//            }
            mCounts.add(v + u, ((x == mM && w == y) ? 1 : 2));
          }
        }
      }
      ++mM;
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
