package irvine.oeis.a054;

import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002854;

/**
 * A054748 Number of inequivalent n-state 1-input n-output automata.
 * @author Sean A. Irvine
 */
public class A054748 extends A002854 {

  @Override
  protected Q m(final int[] p) {
    // p is partition in count form
    Q sum = Q.ZERO;
    final IntegerPartition part = new IntegerPartition(mN);
    int[] pp;
    int[] qq = new int[mN + 1];
    while ((pp = part.next()) != null) {
      IntegerPartition.toCountForm(pp, qq);
      Z prod = Z.ONE;
      for (int r = 1; r < p.length; ++r) {
        int s1 = 0;
        for (int d = 1; d < p.length; ++d) {
          if (r % d == 0) {
            s1 += d * p[d];
          }
        }
        int s2 = 0;
        for (int d = 1; d < qq.length; ++d) {
          if (r % d == 0) {
            s2 += d * qq[d];
          }
        }
        prod = prod.multiply(Z.valueOf(s1).multiply(s2).pow(p[r]));
      }
      sum = sum.add(new Q(prod, SymmetricGroup.per(qq)));
    }
    return sum;
  }
}
