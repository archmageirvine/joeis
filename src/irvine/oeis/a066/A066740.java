package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066740 Number of distinct partitions of A007504(n) which can be obtained by merging parts in the partition 2+3+5+...+prime(n), where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A066740 extends Sequence0 {

  private Set<List<Integer>> mB = Collections.singleton(Collections.singletonList(2));
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final Set<List<Integer>> res = new HashSet<>();
    final int p = (int) Functions.PRIME.l(mN);
    for (final List<Integer> x : mB) {
      final ArrayList<Integer> y = new ArrayList<>(x);
      y.add(p);
      Collections.sort(y);
      res.add(y);
      for (int k = 0; k < x.size(); ++k) {
        final ArrayList<Integer> z = new ArrayList<>(x);
        z.set(k, z.get(k) + p);
        Collections.sort(z);
        res.add(z);
      }
    }
    mB = res;
    return Z.valueOf(res.size());
  }
}
