package irvine.oeis.a006;

import irvine.math.partitions.IntegerComposition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006543 Maximal iterated binomial coefficients.
 * @author Sean A. Irvine
 */
public class A006543 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int j = 1; j <= mN; ++j) {
      final IntegerComposition part = new IntegerComposition(mN, j);
      int[] p;
      while ((p = part.next()) != null) {
        Z a = Z.valueOf(p[0]);
        for (int k = 1; k < p.length; ++k) {
          a = Binomial.binomial(a, Z.valueOf(p[k]));
        }
        max = max.max(a);
      }
    }
    return max;
  }
}
