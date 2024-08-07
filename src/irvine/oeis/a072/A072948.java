package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A072948 Number of permutations p of {1,2,3,...,2n} such that Sum_{k=1..2n} abs(k-p(k)) = 2n.
 * @author Sean A. Irvine
 */
public class A072948 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final Permutation p = new Permutation(mN);
    long c = 0;
    int[] v;
    while ((v = p.next()) != null) {
      int s = 0;
      for (int k = 0; k < v.length; ++k) {
        s += Math.abs(k - v[k]);
      }
      if (s == mN) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

