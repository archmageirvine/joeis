package irvine.oeis.a333;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A333330 Array read by antidiagonals: T(n,k) is the number of k-regular loopless multigraphs on n unlabeled nodes, n &gt;= 0, k &gt;= 0.
 * @author Gregory Morse
 */
public class A333330 extends Sequence0 {
  private final boolean mLoops;
  private final boolean mLabeled;
  private int mN = 0;
  private int mK = -1;

  protected A333330(final boolean loops, final boolean labeled) {
    mLoops = loops;
    mLabeled = labeled;
  }

  /** Construct the sequence. */
  public A333330() {
    this(false, false);
  }

  private static final class FixedGraphs {
    private final int[] mCycles;
    private final boolean mLoops;
    private final HashMap<String, Z> mCache = new HashMap<>();

    private FixedGraphs(final int[] cycles, final boolean loops) {
      mCycles = cycles;
      mLoops = loops;
    }

    private Z diagonal(final int i, final int degree) {
      final int length = mCycles[i];
      final int pairs = (length - 1) / 2 + (mLoops ? 1 : 0);
      // Opposite vertices in an even cycle supply one orbit of degree one.
      if ((length & 1) == 0) {
        return Binomial.binomial(degree / 2 + pairs, pairs);
      }
      if ((degree & 1) != 0) {
        return Z.ZERO;
      }
      return pairs == 0 ? Z.valueOf(degree == 0 ? 1 : 0) : Binomial.binomial(degree / 2 + pairs - 1, pairs - 1);
    }

    private Z between(final int i, final int j, final int degree, final int[] remaining) {
      if (j == remaining.length) {
        final Z ways = diagonal(i, degree);
        return ways.isZero() ? Z.ZERO : ways.multiply(count(i + 1, remaining));
      }
      // There are gcd(a,b) orbits, each of size lcm(a,b).
      final int g = Functions.GCD.i(mCycles[i], mCycles[j]);
      final int a = mCycles[j] / g;
      final int b = mCycles[i] / g;
      final int old = remaining[j];
      final int limit = Math.min(degree / a, old / b);
      Z sum = Z.ZERO;
      for (int k = 0; k <= limit; ++k) {
        remaining[j] = old - b * k;
        sum = sum.add(Binomial.binomial(k + g - 1, g - 1).multiply(between(i, j + 1, degree - a * k, remaining)));
      }
      remaining[j] = old;
      return sum;
    }

    private Z count(final int i, final int[] remaining) {
      if (i == remaining.length) {
        return Z.ONE;
      }
      final int[] key = Arrays.copyOfRange(remaining, i, remaining.length);
      // Cycles of the same length are interchangeable in the residual problem.
      for (int j = i; j < remaining.length;) {
        int end = j + 1;
        while (end < remaining.length && mCycles[end] == mCycles[j]) {
          ++end;
        }
        Arrays.sort(key, j - i, end - i);
        j = end;
      }
      final String s = Arrays.toString(key);
      final Z cached = mCache.get(s);
      if (cached != null) {
        return cached;
      }
      final Z res = between(i, i + 1, remaining[i], remaining);
      mCache.put(s, res);
      return res;
    }

    private Z count(final int k) {
      final int[] remaining = new int[mCycles.length];
      Arrays.fill(remaining, k);
      return count(0, remaining);
    }
  }

  protected final Z regular(final int n, final int k) {
    if (n == 0 || k == 0) {
      return Z.ONE;
    }
    if ((n & k & 1) != 0) {
      return Z.ZERO;
    }
    if (mLabeled) {
      final int[] cycles = new int[n];
      Arrays.fill(cycles, 1);
      return new FixedGraphs(cycles, mLoops).count(k);
    }
    final IntegerPartition part = new IntegerPartition(n);
    Z sum = Z.ZERO;
    int[] p;
    while ((p = part.next()) != null) {
      sum = sum.add(new FixedGraphs(p, mLoops).count(k).multiply(IntegerPartition.permCount(p)));
    }
    return sum.divide(Functions.FACTORIAL.z(n));
  }

  protected Z t(final int n, final int k) {
    return regular(n, k);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return t(mK, mN - mK);
  }
}
