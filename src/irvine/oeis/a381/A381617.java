package irvine.oeis.a381;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A381617 A sequence constructed by greedily sampling the zeta distribution for parameter value 2, 1/(zeta(2)*i^2) to minimize discrepancy.
 * @author Sean A. Irvine
 */
public class A381617 extends Sequence1 {

  private static final int ACCURACY = -1000;
  private final DynamicLongArray mCounts = new DynamicLongArray();
  private final MemoryFunction1<CR> mPdf;
  private long mN = 0;

  protected A381617(final MemoryFunction1<CR> pdf) {
    mPdf = pdf;
  }

  /** Construct the sequence. */
  public A381617() {
    this(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        if (n == 0) {
          return CR.ZERO;
        }
        return Zeta.zeta(2).multiply((long) n * n).inverse();
      }
    });
  }

  @Override
  public Z next() {
    ++mN;
    CR max = null;
    int argmax = 0;
    int k = 0;
    while (true) {
      final long c = mCounts.get(++k);
      final CR d = mPdf.get(k).multiply(mN).subtract(c);
      if (max == null || d.compareTo(max, ACCURACY) > 0) {
        max = d;
        argmax = k;
      }
      if (c == 0) {
        mCounts.increment(argmax);
        return Z.valueOf(argmax);
      }
    }
  }
}

