package irvine.oeis.a133;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A133922.
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

