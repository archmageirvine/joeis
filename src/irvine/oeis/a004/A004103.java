package irvine.oeis.a004;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004103 Number of nets on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A004103 extends Sequence0 {

  private int mN = -1;

  private Z fix(final int[] j) {
    int e3 = 0;
    for (int t = 1; t < j.length; ++t) {
      for (int r = 1; r < t; ++r) {
        e3 += IntegerUtils.gcd(r, t) * j[r] * j[t];
      }
    }
    for (int k = 1; k < j.length; ++k) {
      e3 += (k / 2) * j[k];
      e3 += k * j[k] * (j[k] - 1) / 2;
    }
    int e2 = 0;
    for (int k = 1; k < j.length; ++k) {
      e2 += j[k];
    }
    return Z.THREE.pow(e3).shiftLeft(e2);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition part = new IntegerPartition(mN);
    final int[] s = new int[mN + 1];
    int[] p;
    Q sum = Q.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, s);
      sum = sum.add(new Q(fix(s), SymmetricGroup.per(s)));
    }
    return sum.toZ();
  }
}

