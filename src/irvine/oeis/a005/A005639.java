package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;


/**
 * A005639 Number of self-converse oriented graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A005639 extends Sequence1 {

  private int mN = 0;

  private int c(final int[] j) {
    int c = 0;
    for (int i = 2; i < j.length; i += 2) {
      c += i * j[i] * j[i] / 2;
    }
    for (int i = 4; i < j.length; i += 4) {
      c -= j[i];
    }
    for (int k = 1; k < j.length; ++k) {
      for (int i = k + 1; i < j.length; ++i) {
        if ((k & 1) == 0 || (i & 1) == 0) {
          c += Functions.GCD.i(k, i) * j[k] * j[i];
        }
      }
    }
    return c;
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    final int[] alpha = new int[mN + 1];
    int[] p;
    Q sum = Q.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, alpha);
      sum = sum.add(new Q(Z.THREE.pow(c(alpha)), SymmetricGroup.per(alpha)));
    }
    return sum.toZ();
  }
}

