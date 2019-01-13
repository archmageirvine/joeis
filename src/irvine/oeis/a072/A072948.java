package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A072948.
 * @author Sean A. Irvine
 */
public class A072948 implements Sequence {

  private int mN = 0;

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

