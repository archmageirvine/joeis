package irvine.oeis.a036;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036046.
 * @author Sean A. Irvine
 */
public class A036051 implements Sequence {

  // todo

  private int mN = 0;

  private static final class Wrapper {
    private final int[] mPartition;

    private Wrapper(final int[] partition) {
      mPartition = partition;
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mPartition);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Wrapper && Arrays.equals(mPartition, ((Wrapper) obj).mPartition);
    }

    @Override
    public String toString() {
      return Arrays.toString(mPartition);
    }
  }

  @Override
  public Z next() {
    final LinkedHashMap<Wrapper, Integer> map = new LinkedHashMap<>();
    final TreeSet<int[]> lex = new TreeSet<>(Comparators.INCREASING_LENGTH_DECREASING_VALUE);
    final IntegerPartition integerPartition = new IntegerPartition(++mN);
    int[] p;
    int k = 0;
    while ((p = integerPartition.next()) != null) {
      map.put(new Wrapper(p), ++k);
      lex.add(p);
    }
    k = 0;
    Z sum = Z.ZERO;
    for (final int[] part : lex) {
      sum = sum.add(Math.abs(map.get(new Wrapper(part)) - ++k));
    }
    return sum;
  }
}

