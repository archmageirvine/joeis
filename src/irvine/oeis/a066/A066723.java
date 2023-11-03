package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036839.
 * @author Sean A. Irvine
 */
public class A066723 extends Sequence0 {

  private Set<List<Integer>> mB = Collections.singleton(Collections.singletonList(1));
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final Set<List<Integer>> res = new HashSet<>();
    for (final List<Integer> x : mB) {
      final ArrayList<Integer> y = new ArrayList<>(x);
      y.add(mN);
      Collections.sort(y);
      res.add(y);
      for (int k = 0; k < x.size(); ++k) {
        final ArrayList<Integer> z = new ArrayList<>(x);
        z.set(k, z.get(k) + mN);
        Collections.sort(z);
        res.add(z);
      }
    }
    mB = res;
    return Z.valueOf(res.size());
  }
}
