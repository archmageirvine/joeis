package irvine.oeis.a386;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A386016 A sequence constructed by greedily sampling the Borel distribution for parameter value 1/2 to minimize discrepancy.
 * @author Sean A. Irvine
 */
public class A386016 extends Sequence1 {

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private final MemoryFunction1<CR> mPdf;

  protected A386016(final MemoryFunction1<CR> pdf) {
    mPdf = pdf;
  }

  /** Construct the sequence. */
  public A386016() {
    this(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        if (n == 0) {
          return CR.ZERO;
        }
        final CR k = CR.valueOf(new Q(n, 2));
        return k.pow(n - 1).divide(k.exp().multiply(Functions.FACTORIAL.z(n)));
      }
    });
  }

  @Override
  public Z next() {
    CR min = null;
    int argmin = 0;
    int k = 0;
    while (true) {
      final long c = mCounts.get(++k);
      final CR p = CR.valueOf(c + 1).divide(mPdf.get(k));
      if (min == null || p.compareTo(min) < 0) {
        min = p;
        argmin = k;
      }
      if (c == 0) {
        mCounts.increment(argmin);
        return Z.valueOf(argmin);
      }
    }
  }
}

