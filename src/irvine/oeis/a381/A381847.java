package irvine.oeis.a381;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A381847.
 * @author Sean A. Irvine
 */
public class A381847 extends Sequence1 {

  private static final class OrderedTriple implements Comparable<OrderedTriple> {
    private final int[] mTriple;

    private OrderedTriple(final int... triple) {
      mTriple = Arrays.copyOf(triple, triple.length);
      Arrays.sort(mTriple);
    }

    private void set(final int index, final int value) {
      mTriple[index] = value;
      Arrays.sort(mTriple);
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

  private final int mCuboids;
  private int mN = 0;

  protected A381847(final int cuboids) {
    mCuboids = cuboids;
  }

  /** Construct the sequence. */
  public A381847() {
    this(3);
  }

  @Override
  public Z next() {
    ++mN;
    Set<List<OrderedTriple>> triples = Collections.singleton(Collections.singletonList(new OrderedTriple(mN, mN, mN)));
    for (int k = 1; k < mCuboids; ++k) {
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
    // Finally, check the count of distinct triples in the set
    int cnt = 0;
    for (final List<OrderedTriple> t : triples) {
      if (new TreeSet<>(t).size() == mCuboids) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

