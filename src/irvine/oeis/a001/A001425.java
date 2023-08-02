package irvine.oeis.a001;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001425 Number of commutative groupoids with n elements.
 * @author Sean A. Irvine
 */
public class A001425 extends Sequence0 {

  private int mN = -1;

  /**
   * Compute <code>sum {d|i} (d*s_d)</code>.
   * @param i value
   * @param s array
   * @return sum
   */
  public static Z sum(final int i, final int[] s) {
    Z sum = Z.ZERO;
    final int limit = Math.min(i, s.length - 1);
    for (int d = 1; d <= limit; ++d) {
      if (i % d == 0) {
        sum = sum.add(d * (long) s[d]);
      }
    }
    return sum;
  }

  protected Z f(final int i, final int j, final int[] s) {
    if (i == j) {
      if ((i & 1) == 1) {
        return sum(i, s).pow(((long) i * s[i] * s[i] + s[i]) / 2);
      } else {
        final int k = i / 2;
        return sum(i, s).pow((long) k * s[i] * s[i]).multiply(sum(k, s).pow(s[i]));
      }
    } else {
      final int lcm = IntegerUtils.lcm(i, j);
      return sum(lcm, s).pow((long) IntegerUtils.gcd(i, j) * s[i] * s[j]);
    }
  }

  protected Z fix(final int[] s) {
    Z prod = Z.ONE;
    for (int j = 1; j < s.length; ++j) {
      for (int i = j; i < s.length; ++i) {
        prod = prod.multiply(f(i, j, s));
      }
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ONE;
    }
    final IntegerPartition ip = new IntegerPartition(mN);
    final int[] a = new int[mN + 1];
    Q s = Q.ZERO;
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, a);
      s = s.add(new Q(fix(a), SymmetricGroup.per(a)));
    }
    return s.toZ();
  }
}
