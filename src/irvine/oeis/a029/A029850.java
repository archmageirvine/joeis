package irvine.oeis.a029;

import static irvine.oeis.a001.A001425.sum;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029850 Number of self-converse groupoids.
 * @author Sean A. Irvine
 */
public class A029850 implements Sequence {

  private int mN = -1;

  private Z f(final int i, final int j, final int[] s) {
    if (i == j) {
      if ((i & 1) == 1) {
        return sum(2 * i, s).pow((i * s[i] * s[i] - s[i]) / 2).multiply(sum(i, s).pow(s[i]));
      } else if ((i & 3) == 0) {
        return sum(i, s).pow(i * s[i] * s[i]);
      } else {
        assert (i & 3) == 2;
        return sum(i, s).pow(i * s[i] * s[i] - s[i]).multiply(sum(i / 2, s).pow(2 * s[i]));
      }
    } else {
      final int lcm = IntegerUtils.lcm(IntegerUtils.lcm(i, j), 2);
      return sum(lcm, s).pow(2 * i * j * s[i] * s[j] / lcm);
    }
  }

  private Z fix(final int[] s) {
    Z prod = Z.ONE;
    for (int j = 1; j < s.length; ++j) {
      for (int i = j; i < s.length; ++i) {
        //System.out.println("i=" + i + " j=" + j + " s[i]=" + s[i] + " s[j]=" + s[j] + " f=" + f(i, j, s));
        prod = prod.multiply(f(i, j, s));
      }
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
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
