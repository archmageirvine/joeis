package irvine.oeis.a065;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065677 Maximal Diffy_length for quadruples of numbers &lt;= n.
 * @author Sean A. Irvine
 */
public class A065677 extends Sequence0 {

  // This could be made more memory efficient by handling symmetry
  // This could be made much faster by simply inverting A065678

  private int mN = -1;
  private int mMax = 0;
  private final MemoryFunctionInt4<Integer> mDiffy = new MemoryFunctionInt4<>() {
    @Override
    protected Integer compute(final int a, final int b, final int c, final int d) {
      if (a == 0 && b == 0 && c == 0 && d == 0) {
        return 0;
      }
      final int da = Math.abs(a - b);
      final int db = Math.abs(b - c);
      final int dc = Math.abs(c - d);
      final int dd = Math.abs(d - a);
      return 1 + get(da, db, dc, dd);
    }
  };

  @Override
  public Z next() {
    ++mN;
    for (int b = 0; b <= mN; ++b) {
      for (int c = 0; c <= mN; ++c) {
        for (int d = 0; d <= mN; ++d) {
          final int iterations = mDiffy.get(mN, b, c, d);
          if (iterations > mMax) {
            mMax = iterations;
          }
        }
      }
    }
    return Z.valueOf(mMax);
  }
}
