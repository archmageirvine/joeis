package irvine.oeis.a036;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036046.
 * @author Sean A. Irvine
 */
public class A036046 implements Sequence {

  private int mN = -1;

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

  protected Z order(final List<Integer> v) {
    final TreeSet<Integer> set = new TreeSet<>();
    final boolean[] t = new boolean[v.size()];
    for (int k = 0; k < v.size(); ++k) {
      int c = 0;
      int j = k;
      while (!t[j]) {
        t[j] = true;
        j = v.get(j) - 1;
        ++c;
      }
      if (c > 0) {
        set.add(c);
      }
    }
    Z prod = Z.ONE;
    for (final int s : set) {
      prod = prod.multiply(s);
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final LinkedHashMap<Wrapper, Integer> map = new LinkedHashMap<>();
    final IntegerPartition integerPartition = new IntegerPartition(mN);
    int[] p;
    int k = 0;
    while ((p = integerPartition.next()) != null) {
      map.put(new Wrapper(p), ++k);
    }
    final ArrayList<Integer> v = new ArrayList<>();
    for (final Map.Entry<Wrapper, Integer> e : map.entrySet()) {
      final int[] dual = IntegerPartition.dual(e.getKey().mPartition);
      v.add(map.get(new Wrapper(dual)));
    }
    Collections.reverse(v);
    //System.out.println(mN + " " + v + " " + map);
    return order(v);
  }
}

