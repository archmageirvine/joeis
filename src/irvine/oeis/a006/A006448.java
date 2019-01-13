package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006448.
 * @author Sean A. Irvine
 */
public class A006448 implements Sequence {

  private int mN = 0;

  private Z fix(final int[] s) {
    Z prod = Z.valueOf(s[1]);
    for (int i = 1; i < s.length; ++i) {
      for (int j = 1; j < s.length; ++j) {
        Z sum = Z.ZERO;
        for (final Z dd : Cheetah.factor(IntegerUtils.lcm(i, j)).divisors()) {
          final int d = dd.intValueExact();
          if (d < s.length) {
            sum = sum.add(dd.multiply(s[d]));
          }
        }
        prod = prod.multiply(sum.pow(IntegerUtils.gcd(i, j) * s[i] * s[j]));
      }
    }
    return prod;
  }

  @Override
  public Z next() {
    Q sum = Q.ZERO;
    final IntegerPartition parts = new IntegerPartition(++mN);
    final int[] s = new int[mN + 1];
    int[] p;
    while ((p = parts.next()) != null) {
      IntegerPartition.toCountForm(p, s);
      sum = sum.add(new Q(fix(s), SymmetricGroup.per(s)));
    }
    return sum.toZ();
  }
}
