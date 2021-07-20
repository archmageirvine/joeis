package irvine.oeis.a008;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A008782 For any circular arrangement of 0..n-1, let S = sum of squares of every sum of three contiguous numbers; then a(n) = # of distinct values of S.
 * @author Sean A. Irvine
 */
public class A008782 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final Permutation p = new Permutation(++mN);
    final HashSet<Long> h = new HashSet<>();
    int[] x;
    while ((x = p.next()) != null) {
      for (int k = 0; k < x.length; ++k) {
        long sum = 0;
        for (int j = 0; j < mN; ++j) {
          final int i = k + j;
          final long t = x[i % mN] + x[(i + 1) % mN] + x[(i + 2) % mN];
          sum += t * t;
        }
        h.add(sum);
      }
    }
    return Z.valueOf(h.size());
  }
}


