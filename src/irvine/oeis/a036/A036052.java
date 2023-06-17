package irvine.oeis.a036;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A036052 Product of the lengths of the cycle types of the permutation created by length sorting on the partitions of n.
 * @author Sean A. Irvine
 */
public class A036052 extends AbstractSequence {

  /** Construct the sequence. */
  public A036052() {
    super(0);
  }

  private int mN = -1;

  protected Z count(final List<Integer> v) {
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
    final LinkedHashMap<A036046.Wrapper, Integer> map = new LinkedHashMap<>();
    final TreeSet<int[]> lex = new TreeSet<>(Comparators.INCREASING_LENGTH_DECREASING_VALUE);
    final IntegerPartition integerPartition = new IntegerPartition(mN);
    int[] p;
    int k = 0;
    while ((p = integerPartition.next()) != null) {
      map.put(new A036046.Wrapper(p), ++k);
      lex.add(p);
    }
    final ArrayList<Integer> v = new ArrayList<>();
    for (final int[] part : lex) {
      v.add(lex.size() + 1 - map.get(new A036046.Wrapper(part)));
    }
    Collections.reverse(v);
    return count(v);
  }
}

