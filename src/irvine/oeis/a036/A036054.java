package irvine.oeis.a036;

import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A036054 Number of different cycle lengths of the permutation created by length sorting on the partitions of n.
 * @author Sean A. Irvine
 */
public class A036054 extends A036052 {

  /** Construct the sequence. */
  public A036054() {
    super(1);
  }

  {
    super.next();
  }

  @Override
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
    return Z.valueOf(set.size());
  }
}
