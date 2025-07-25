package irvine.oeis.a381;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A381847 a(n) is the number of ways to partition an n X n X n cube into 3 cuboids of different dimensions.
 * @author Sean A. Irvine
 */
public class A381847 extends Sequence1 {

  protected static final class OrderedTriple implements Comparable<OrderedTriple> {
    private final int[] mTriple;

    private OrderedTriple(final int... triple) {
      mTriple = Arrays.copyOf(triple, triple.length);
      Arrays.sort(mTriple);
    }

    private void set(final int index, final int value) {
      mTriple[index] = value;
      Arrays.sort(mTriple);
    }

    /**
     * Volume of this cuboid.
     * @return the volume
     */
    public Z volume() {
      return Functions.PRODUCT.z(mTriple);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof OrderedTriple)) {
        return false;
      }
      return Arrays.equals(mTriple, ((OrderedTriple) obj).mTriple);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mTriple);
    }

    @Override
    public String toString() {
      return Arrays.toString(mTriple);
    }

    @Override
    public int compareTo(final OrderedTriple other) {
      return Arrays.compare(mTriple, other.mTriple);
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected final int mCuboids;
  private int mN;

  protected A381847(final int offset, final int cuboids) {
    if (cuboids > 4) {
      throw new UnsupportedOperationException("Use the A386296 implementation instead");
    }
    mCuboids = cuboids;
    mN = offset - 1;
  }

  protected A381847(final int cuboids) {
    this(1, cuboids);
  }

  /** Construct the sequence. */
  public A381847() {
    this(3);
  }

  protected Z process(final Set<List<OrderedTriple>> triples, final int cuboids) {
    // Finally, check the count of distinct triples in the set
    int cnt = 0;
    for (final List<OrderedTriple> t : triples) {
      if (new TreeSet<>(t).size() == cuboids) {
        if (mVerbose) {
          StringUtils.message(t.toString());
        }
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

  protected Z t(final int n, final int cuboids) {
    Set<List<OrderedTriple>> triples = Collections.singleton(Collections.singletonList(new OrderedTriple(n, n, n)));
    for (int k = 1; k < cuboids; ++k) {
      final Set<List<OrderedTriple>> next = new HashSet<>();
      for (final List<OrderedTriple> set : triples) {
        for (final OrderedTriple t : set) {
          // Choose which component of the triple to split
          for (int j = 0; j < 3; ++j) {
            // Choose the split
            final int tj = t.mTriple[j];
            for (int z = 1; 2 * z <= tj; ++z) {
              final List<OrderedTriple> copy = new ArrayList<>(set);
              copy.remove(t);
              final OrderedTriple ta = new OrderedTriple(t.mTriple);
              ta.set(j, z);
              copy.add(ta);
              final OrderedTriple tb = new OrderedTriple(t.mTriple);
              tb.set(j, tj - z);
              copy.add(tb);
              Collections.sort(copy);
              next.add(copy);
            }
          }
        }
      }
      triples = next;
    }
    return process(triples, cuboids);
  }

  @Override
  public Z next() {
    return t(++mN, mCuboids);
  }
}
