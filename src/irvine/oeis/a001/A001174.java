package irvine.oeis.a001;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001174 Number of oriented graphs (i.e., digraphs with no bidirected edges) on n unlabeled nodes. Also number of complete digraphs on n unlabeled nodes. Number of antisymmetric relations (i.e., oriented graphs with loops) on n unlabeled nodes is A083670.
 * @author Sean A. Irvine
 */
public class A001174 implements Sequence {

  protected int mN = 0;

  private int t(final int[] j) {
    int sum = 0;
    for (int k = 1; k < j.length; ++k) {
      sum += j[k] * ((k - 1) / 2) + k * (j[k] * (j[k] - 1) / 2);
    }
    for (int s = 1; s < j.length; ++s) {
      for (int r = 1; r < s; ++r) {
        sum += j[r] * j[s] * IntegerUtils.gcd(r, s);
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition ip = new IntegerPartition(mN);
    final int[] a = new int[mN + 1];
    Q s = Q.ZERO;
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, a);
      s = s.add(new Q(Z.THREE.pow(t(a)), SymmetricGroup.per(a)));
    }
    return s.toZ();
  }
}
