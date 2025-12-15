package irvine.oeis.a386;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A386966 Numbers that can be written in exactly two different ways as s_1^x_1 + ... + s_t^x_t, with 1 &lt; s_1 &lt; ... &lt; s_t and {s_1,..., s_t} = {x_1,..., x_t} for some t &gt; 0.
 * @author Sean A. Irvine
 */
public class A386966 extends Sequence1 {

  // This works but is very slow

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

  private final int mTarget;
  private final TreeSet<Generator> mGenerators = new TreeSet<>();
  private final TreeMap<Long, Integer> mRepresentations = new TreeMap<>();
  {
    mGenerators.add(new Generator(new int[] {2}, 4));
  }

  protected A386966(final int target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A386966() {
    this(2);
  }

  private void add(final int[] gen) {
    Z t = Z.ZERO;
    for (int k = 0; k < gen.length; ++k) {
      t = t.add(Z.valueOf(gen[k]).pow(gen[gen.length - k - 1]));
    }
    if (t.bitLength() < Long.SIZE) {
      mGenerators.add(new Generator(gen, t.longValue()));
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (!mRepresentations.isEmpty() && mRepresentations.firstKey().compareTo(mGenerators.first().mMin) < 0) {
        final Map.Entry<Long, Integer> e = mRepresentations.pollFirstEntry();
        if (e.getValue() == mTarget) {
          return Z.valueOf(e.getKey());
        }
      }
      final Generator g = mGenerators.pollFirst();
      final int[] gen = g.mGen;
      final int len = gen.length;
      final Z[] gz = ZUtils.toZ(gen);
      final Permutation perm = new Permutation(gen);
      int[] p;
      while ((p = perm.next()) != null) {
        Z sum = Z.ZERO;
        for (int k = 0; k < len; ++k) {
          sum = sum.add(gz[k].pow(p[k]));
        }
        if (sum.bitLength() < Long.SIZE) {
          mRepresentations.merge(sum.longValue(), 1, Integer::sum);
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
      // Can now safely reuse gen
      ++gen[len - 1];
      add(gen);
    }
  }
}
