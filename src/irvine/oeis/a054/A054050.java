package irvine.oeis.a054;

import java.io.Serializable;

import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054050 Number of nonisomorphic binary n-state automata.
 * @author Sean A. Irvine
 */
public class A054050 implements Sequence, Serializable {

  private int mN = 0;

  protected Z fix(final int[] j) {
    Z prod = Z.ONE;
    for (int i = 1; i < j.length; ++i) {
      long sum = 0;
      for (int d = 1; d <= i; ++d) {
        if (j[i] > 0 && i % d == 0) {
          sum += d * (long) j[d];
        }
      }
      prod = prod.multiply(Z.valueOf(sum).pow(2L * j[i]));
    }
    return prod;
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    final int[] j = new int[mN + 1];
    int[] p;
    Q sum = Q.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      sum = sum.add(new Q(fix(j), SymmetricGroup.per(j)));
    }
    return sum.toZ();
  }
}
