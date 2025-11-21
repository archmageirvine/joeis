package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A081993 a(n) = sum of numbers formed using the digits of next n numbers.
 * @author Sean A. Irvine
 */
public class A081993 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mN; ++k) {
      sb.append(++mM);
    }
    final Permutation perm = Permutation.permuter(new Z(sb));
    int[] p;
    Z sum = Z.ZERO;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        sum = sum.add(Permutation.permToZ(p));
      }
    }
    return sum;
  }
}
