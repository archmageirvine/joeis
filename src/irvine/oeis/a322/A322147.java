package irvine.oeis.a322;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A322147 Regular triangle read by rows where T(n,k) is the number of labeled connected graphs with loops with n edges and k vertices, 1 &lt;= k &lt;= n+1.
 * @author Gregory Morse
 */
public class A322147 extends Sequence0 {
  private final boolean mLoops;
  private final boolean mParallel;
  private int mN = -1;
  private int mK = 0;

  protected A322147(final boolean loops, final boolean parallel) {
    mLoops = loops;
    mParallel = parallel;
  }

  /** Construct the sequence. */
  public A322147() {
    this(true, false);
  }

  private Z all(final int vertices, final int edges) {
    final long slots = (long) vertices * (vertices - 1) / 2 + (mLoops ? vertices : 0);
    return edges == 0 ? Z.ONE : Binomial.binomial(mParallel ? slots + edges - 1 : slots, edges);
  }

  private final MemoryFunctionInt2<Z> mConnected = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      Z sum = all(n, m);
      for (int k = 1; k < n; ++k) {
        final Z labels = Binomial.binomial(n - 1, k - 1);
        for (int e = k - 1; e <= m; ++e) {
          sum = sum.subtract(labels.multiply(get(k, e)).multiply(all(n - k, m - e)));
        }
      }
      return sum;
    }
  };

  protected final Z connected(final int vertices, final int edges) {
    return mConnected.get(vertices, edges);
  }

  @Override
  public Z next() {
    if (++mK > mN + 1) {
      ++mN;
      mK = 1;
    }
    return connected(mK, mN);
  }
}
