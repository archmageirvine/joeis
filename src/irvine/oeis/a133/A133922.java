package irvine.oeis.a133;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A133922 a(n) is number of permutations (p(1),p(2),p(3),...,p(n)) of (1,2,3,...,n) such that p(k) is coprime to p(n+1-k) for k = all positive integers &lt;= n.
 * @author Sean A. Irvine
 */
public class A133922 implements Sequence {

  private int mN = 0;

  private boolean check(final int[] p) {
    if ((p.length & 1) == 1 && p[p.length / 2] != 0) {
      return false;
    }
    for (int k = 0, j = p.length - 1; k < p.length / 2; ++k, --j) {
      if (IntegerUtils.gcd(p[k] + 1, p[j] + 1) != 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final Permutation perm = new Permutation(++mN);
    int[] p;
    long c = 0;
    while ((p = perm.next()) != null) {
      if (check(p)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

