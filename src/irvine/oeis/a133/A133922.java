package irvine.oeis.a133;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A133922 <code>a(n) =</code> number of permutations <code>(p(1),p(2),p(3),...p(n))</code> of <code>(1,2,3,...n)</code> such that <code>p(k)</code> is coprime to <code>p(n+1-k)</code> for <code>k =</code> all positive integers <code>&lt;=n</code>.
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

