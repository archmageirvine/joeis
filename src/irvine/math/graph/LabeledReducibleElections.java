package irvine.math.graph;

import java.util.function.IntFunction;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Two-color assemblies of labeled regions for the SCC header elections.
 * @author Gregory Morse
 */
public final class LabeledReducibleElections {

  private final LabeledReducibleDigraphs mRegion = new LabeledReducibleDigraphs();
  private final IntFunction<Z> mSource;

  /**
   * Construct the election recurrence.
   * @param every whether every election must be reducible
   */
  public LabeledReducibleElections(final boolean every) {
    mSource = every ? EverywhereReducibleDigraphs::strong : new LabeledValidHeaders()::some;
  }

  private final MemoryFunction1<Z> mMarked = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return n == 0 ? Z.ZERO : mSource.apply(n).subtract(mRegion.strong(n).multiply(n));
    }
  };

  private final MemoryFunctionInt3<Z> mBlocks = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int u, final int m) {
      if (u + m == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      Z count = Z.ZERO;
      for (int k = 1; k <= n - u - m + 1; ++k) {
        Z term = Z.ZERO;
        if (u > 0) {
          term = mRegion.strong(k).multiply(k).multiply(get(n - k, u - 1, m));
        }
        if (m > 0) {
          term = term.add(mMarked.get(k).multiply(get(n - k, u, m - 1)));
        }
        count = count.add(Binomial.binomial(n - 1, k - 1).multiply(term));
      }
      return count;
    }
  };

  // Cross edges enter unmarked headers only.
  private final MemoryFunctionInt3<Z> mAssemblies = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int u, final int m) {
      if (u + m == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      Z count = Z.ZERO;
      for (int j = 0; j <= u; ++j) {
        for (int k = 0; k <= m; ++k) {
          final int blocks = j + k;
          if (blocks == 0) {
            continue;
          }
          for (int v = blocks; v <= n - u - m + blocks; ++v) {
            final Z prefix = mBlocks.get(v, j, k);
            if (!prefix.isZero()) {
              final Z term = Binomial.binomial(n, v).multiply(prefix).multiply(get(n - v, u - j, m - k)).shiftLeft((long) v * (u - j));
              count = (blocks & 1) == 0 ? count.subtract(term) : count.add(term);
            }
          }
        }
      }
      return count;
    }
  };

  /**
   * Count digraphs reducible in the specified election mode.
   * @param n number of vertices
   * @return count
   */
  public Z count(final int n) {
    Z count = Z.ZERO;
    for (int u = 0; u <= n; ++u) {
      for (int m = 0; m <= n - u; ++m) {
        count = count.add(mAssemblies.get(n, u, m));
      }
    }
    return count;
  }
}
