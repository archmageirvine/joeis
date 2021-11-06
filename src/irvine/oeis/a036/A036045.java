package irvine.oeis.a036;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036045 Sum of distances between dual pairs of partitions of n for the canonical order.
 * @author Sean A. Irvine
 */
public class A036045 implements Sequence {

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
  }

  @Override
  public Z next() {
    final HashMap<Wrapper, Integer> map = new HashMap<>();
    final IntegerPartition integerPartition = new IntegerPartition(++mN);
    int[] p;
    int k = 0;
    while ((p = integerPartition.next()) != null) {
      map.put(new Wrapper(p), ++k);
    }
    Z sum = Z.ZERO;
    for (final Map.Entry<Wrapper, Integer> e : map.entrySet()) {
      final int[] dual = IntegerPartition.dual(e.getKey().mPartition);
      sum = sum.add(Math.abs(e.getValue() - map.get(new Wrapper(dual))));
    }
    return sum;
  }
}

