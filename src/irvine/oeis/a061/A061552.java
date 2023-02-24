package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061552 Number of 1324-avoiding permutations of length n.
 * @author Sean A. Irvine
 */
public class A061552 extends Sequence0 {

  private static final int[] SMALL = {1, 1, 2, 6, 23};
  private int mN = -1;

  private Z nodes(final List<Integer> p, final int h) {
    if (h == 0) {
      Z s = Z.ZERO;
      for (final int v : p) {
        s = s.add(v);
      }
      return s;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j < p.size(); ++j) {
      final List<Integer> l = new ArrayList<>();
      l.add(p.get(j) + 1);
      for (int i = 1; i <= j; ++i) {
        l.add(Math.min(j + 2, p.get(i)));
      }
      for (int i = j + 1; i < p.get(j); ++i) {
        l.add(p.get(i - 1) + 1);
      }
      sum = sum.add(nodes(l, h - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[mN]);
    }
    return nodes(Arrays.asList(5, 5, 5, 5), mN - 5)
      .add(nodes(Arrays.asList(5, 3, 5, 5), mN - 5))
      .add(nodes(Arrays.asList(5, 4, 4, 5), mN - 5))
      .add(nodes(Arrays.asList(5, 5, 4, 5), mN - 5))
      .add(nodes(Arrays.asList(5, 3, 4, 5), mN - 5))
      .add(nodes(Arrays.asList(4, 3, 4), mN - 5));
  }
}
