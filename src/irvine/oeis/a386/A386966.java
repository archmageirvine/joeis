package irvine.oeis.a386;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;
import irvine.util.array.LongDynamicByteArray;
import irvine.util.string.StringUtils;

/**
 * A386966 Numbers that can be written in exactly two different ways as s_1^x_1 + ... + s_t^x_t, with 1 &lt; s_1 &lt; ... &lt; s_t and {s_1,..., s_t} = {x_1,..., x_t} for some t &gt; 0.
 * @author Sean A. Irvine
 */
public class A386966 extends Sequence1 {

  // This can be increased for a bigger search range
  private static final int DEFAULT_BITS = 32;

  private static final class Generator implements Comparable<Generator> {

    private final int[] mGen;
    private final long mMin;

    private Generator(final int[] gen, final long min) {
      mGen = gen;
      mMin = min;
    }

    @Override
    public int compareTo(final Generator generator) {
      final int c = Long.compare(mMin, generator.mMin);
      if (c != 0) {
        return c;
      }
      return Arrays.compare(mGen, generator.mGen);
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final int mTarget;
  private final int mBits;
  private final long mLimit;
  private final long[][] mPowers;
  private final TreeSet<Generator> mGenerators = new TreeSet<>();
  private final LongDynamicByteArray mRepresentations = new LongDynamicByteArray();
  {
    mGenerators.add(new Generator(new int[] {2}, 4));
  }
  long mN = 1;

  protected A386966(final int target, final int bits) {
    mTarget = target;
    mBits = bits;
    mLimit = 1L << mBits;
    mPowers = new long[mBits + 1][mBits + 1];
    for (int x = 2; x < mPowers.length; ++x) {
      final Z z = Z.valueOf(x);
      for (int y = 2; y < mPowers.length; ++y) {
        final Z t = z.pow(y);
        if (t.bitLength() <= mBits) {
          mPowers[x][y] = t.longValue();
        }
      }
    }
  }

  protected A386966(final int target) {
    this(target, DEFAULT_BITS);
  }

  /** Construct the sequence. */
  public A386966() {
    this(2);
  }

  private long computeSum(final int[] gen) {
    long t = 0;
    for (int k = gen.length - 1, j = 0; k >= 0; --k, ++j) {
      final long u = mPowers[gen[k]][gen[j]];
      if (u == 0) {
        return 0;
      }
      t += u;
      if (t > mLimit) {
        return 0;
      }
    }
    return t;
  }

  private void add(final int[] gen) {
    final long t = computeSum(gen);
    if (t > 0) {
      mGenerators.add(new Generator(gen, t));
    }
  }

  private long computeSum(final int[] gen, final int[] p) {
    long t = 0;
    for (int k = gen.length - 1; k >= 0; --k) {
      final long v = mPowers[gen[k]][p[k]];
      if (v == 0) {
        return 0;
      }
      t += v;
      if (t > mLimit) {
        return 0;
      }
    }
    return t;
  }

  @Override
  public Z next() {
    while (true) {
      while (mN < mGenerators.first().mMin) {
        if (mRepresentations.get(mN) == mTarget) {
          return Z.valueOf(mN++);
        }
        ++mN;
        if (mVerbose && mN % 10000000 == 0) {
          StringUtils.message("Search completed to n=" + mN + " queued generators=" + mGenerators.size());
        }
      }
      final Generator g = mGenerators.pollFirst();
      final int[] gen = g.mGen;
      final int len = gen.length;
      final Permutation perm = new Permutation(gen);
      int[] p;
      while ((p = perm.next()) != null) {
        final long sum = computeSum(gen, p);
        if (sum > 0) {
          if (mRepresentations.increment(sum) < 0) {
            mRepresentations.set(sum, Byte.MAX_VALUE);
          }
        }
      }
      for (int k = 0; k < len - 1; ++k) {
        if (gen[k] + 1 < gen[k + 1]) {
          final int[] copy = Arrays.copyOf(gen, len);
          ++copy[k];
          add(copy);
        }
      }
      final int[] longer = Arrays.copyOf(gen, len + 1);
      longer[len] = gen[len - 1] + 1;
      add(longer);
      // Can now safely reuse gen in a new generator
      ++gen[len - 1];
      add(gen);
      if (mGenerators.isEmpty()) {
        // Exceeded search limits
        throw new UnsupportedOperationException();
      }
    }
  }
}
