package irvine.oeis.a383;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383895 Number of spiny partitions with exactly n parts.
 * @author Sean A. Irvine
 */
public class A383895 extends Sequence0 {

  private final ArrayList<List<Z>> mL = new ArrayList<>();
  {
    mL.add(Collections.singletonList(Z.ONE));
  }

  @Override
  public Z next() {
    final int k = mL.size();
    final ArrayList<Z> l = new ArrayList<>();
    l.add(Z.ZERO);
    for (int i = 1; i <= k; ++i) {
      Z sum = Z.ZERO;
      for (int a = k - k / i; a < k; ++a) {
        for (int b = 0; b < i; ++b) {
          sum = sum.add(mL.get(a).get(b));
        }
      }
      l.add(sum);
    }
    mL.add(l);
    return l.get(l.size() - 1);
  }
}

