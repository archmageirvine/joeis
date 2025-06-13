package irvine.oeis.a384;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A384184 allocated for Mia Boudreau.
 * @author Sean A. Irvine
 */
public class A384184 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int[] p = IntegerUtils.identity(new int[++mN]);
    for (int k = 0; k < mN; ++k) {
      final int j = (2 * k) % mN;
      final int t = p[k];
      p[k] = p[j];
      p[j] = t;
    }
    return Permutation.order(p);
  }
}

