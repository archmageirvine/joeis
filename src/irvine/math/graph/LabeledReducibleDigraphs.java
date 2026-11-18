package irvine.math.graph;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Counts of labeled reducible flow graphs and related families.
 * @author Gregory Morse
 */
public final class LabeledReducibleDigraphs {

  // Block assemblies without cross edges.
  private final MemoryFunctionInt2<Z> mBlocks = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, n - k + 1,
        j -> Binomial.binomial(n - 1, j - 1).multiply(j).multiply(strong(j.intValue())).multiply(get(n - j.intValue(), k - 1)));
    }
  };

  // Header-entering acyclic cross edges.
  private final MemoryFunctionInt2<Z> mAcyclic = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= k; ++j) {
        for (int v = j; v <= n - k + j; ++v) {
          final Z term = Binomial.binomial(n, v).multiply(mBlocks.get(v, j)).multiply(get(n - v, k - j)).shiftLeft((long) v * (k - j));
          sum = (j & 1) == 1 ? sum.add(term) : sum.subtract(term);
        }
      }
      return sum;
    }
  };

  // Root-reachable assemblies with a pool of c vertices.
  private final MemoryFunctionInt3<Z> mReachable = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int k, final int c) {
      if (k == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = mAcyclic.get(n, k).shiftLeft((long) c * k);
      for (int j = 0; j < k; ++j) {
        for (int v = j; v <= n - k + j; ++v) {
          sum = sum.subtract(Binomial.binomial(n, v).multiply(get(v, j, c)).multiply(mAcyclic.get(n - v, k - j)).shiftLeft((long) (n - v) * j));
        }
      }
      return sum;
    }
  };

  private final MemoryFunctionInt3<Z> mMarkedProduct = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int u, final int m, final int k) {
      Z sum = Z.ZERO;
      for (int j = Math.max(0, k - u); j <= Math.min(k, m); ++j) {
        final Z term = mAcyclic.get(u, k - j).multiply(mBlocks.get(m, j)).shiftLeft((long) u * j);
        sum = (j & 1) == 0 ? sum.add(term) : sum.subtract(term);
      }
      return sum;
    }
  };

  private final MemoryFunctionInt3<Z> mMarkedReachable = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int u, final int m, final int k) {
      if (k == 0) {
        return u + m == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = mMarkedProduct.get(u, m, k).shiftLeft(k);
      for (int j = 0; j < k; ++j) {
        for (int v = 0; v <= u; ++v) {
          for (int w = Math.max(0, j - v); w <= Math.min(m, u + m - v - k + j); ++w) {
            final Z kept = get(v, w, j);
            if (!kept.isZero()) {
              sum = sum.subtract(Binomial.binomial(u, v).multiply(Binomial.binomial(m, w))
                .multiply(kept).multiply(mMarkedProduct.get(u - v, m - w, k - j)).shiftLeft((long) (u - v) * j));
            }
          }
        }
      }
      return sum;
    }
  };

  private final MemoryFunction1<Z> mStrong = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n == 1) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(0, n - 1, m -> Binomial.binomial(n - 1, m).shiftLeft(n - 1L - m)
        .multiply(Integers.SINGLETON.sum(0, n - 1, k -> mMarkedReachable.get(n - 1 - m.intValue(), m.intValue(), k.intValue()))));
    }
  };

  // The exit is either a separate global sink or inside an ordinary block.
  private final MemoryFunctionInt2<Z> mSeparateExit = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = mReachable.get(n, k, 1).shiftLeft(n);
      for (int v = 0; v < n; ++v) {
        for (int j = Math.max(0, k - (n - v)); j <= Math.min(k - 1, v); ++j) {
          sum = sum.subtract(Binomial.binomial(n, v).multiply(get(v, j)).multiply(mReachable.get(n - v, k - j, v + 1)));
        }
      }
      return sum;
    }
  };

  private final MemoryFunctionInt3<Z> mInternalExit = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int k, final int c) {
      Z sum = mReachable.get(n, k, c);
      for (int v = 1; v < n; ++v) {
        for (int j = Math.max(1, k - (n - v)); j <= Math.min(k - 1, v); ++j) {
          sum = sum.subtract(Binomial.binomial(n - 1, v - 1).multiply(get(v, j, c)).multiply(mReachable.get(n - v, k - j, c + v)));
        }
      }
      return sum;
    }
  };

  /**
   * Strongly connected digraphs reducible from a distinguished entry.
   * @param n number of vertices
   * @return count
   */
  public Z strong(final int n) {
    return mStrong.get(n);
  }

  /**
   * Reducible digraphs with a distinguished entry.
   * @param n number of vertices
   * @return count
   */
  public Z rooted(final int n) {
    return Integers.SINGLETON.sum(1, n, c -> Binomial.binomial(n - 1, c - 1).multiply(strong(c.intValue()))
      .multiply(Integers.SINGLETON.sum(0, n - c, k -> mReachable.get(n - c.intValue(), k.intValue(), c.intValue()))));
  }

  /**
   * Reducible digraphs with a global source.
   * @param n number of vertices
   * @return count
   */
  public Z singleSource(final int n) {
    return Integers.SINGLETON.sum(0, n - 1, k -> mReachable.get(n - 1, k.intValue(), 1));
  }

  /**
   * Pairs of a digraph and a reducible election of source-component headers.
   * @param n number of vertices
   * @return count
   */
  public Z elections(final int n) {
    return Integers.SINGLETON.sum(1, n, k -> mAcyclic.get(n, k.intValue()));
  }

  /**
   * Reducible digraphs with a distinguished entry and exit.
   * @param n number of vertices
   * @return count
   */
  public Z rootedExit(final int n) {
    return strong(n).add(Integers.SINGLETON.sum(1, n - 1, c -> Binomial.binomial(n - 2, c - 1).multiply(strong(c.intValue()))
      .multiply(Integers.SINGLETON.sum(1, n - c, k -> mInternalExit.get(n - c.intValue(), k.intValue(), c.intValue())))));
  }

  /**
   * Reducible digraphs with a global source and global sink.
   * @param n number of vertices
   * @return count
   */
  public Z singleSourceSink(final int n) {
    return n <= 2 ? Z.ONE : Integers.SINGLETON.sum(1, n - 2, k -> mSeparateExit.get(n - 2, k.intValue())).multiply2();
  }
}
