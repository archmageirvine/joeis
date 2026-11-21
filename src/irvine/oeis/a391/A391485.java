package irvine.oeis.a391;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.EulerTransform;

/**
 * A391485 Array read by antidiagonals: T(n,k) is the number of nonequivalent essentially parallel series-parallel networks with longest path of at most n edges and largest cut set of at most k edges.
 * @author Gregory Morse
 */
public class A391485 extends Sequence1 {
  // After Andrew Howroyd.
  private int mN = 0;
  private int mK = 0;
  private final MemoryFunctionInt2<Z> mCounts = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 1) {
        return Z.ONE;
      }
      final Z[] counts = new Z[k - 1];
      for (int j = 1; j < k; ++j) {
        counts[j - 1] = j == 1 ? get(j, n) : get(j, n).subtract(get(j - 1, n));
      }
      return get(n, k - 1).add(new EulerTransform(new FiniteSequence(counts)).skip(k - 1).next());
    }
  };

  protected final Z parallel(final int n, final int k) {
    return mCounts.get(n, k);
  }

  protected Z t(final int n, final int k) {
    return parallel(n, k);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return t(mK, mN + 1 - mK);
  }
}
