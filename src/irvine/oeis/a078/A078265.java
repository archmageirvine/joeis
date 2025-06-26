package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A078265 Integer part of the geometric mean of all the distinct numbers formed by permuting the digits of concatenation of numbers from 1 to n.
 * @author Sean A. Irvine
 */
public class A078265 extends Sequence1 {

  private int mN = 0;

  static int[] makeDigits(final int n) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k <= n; ++k) {
      sb.append(k);
    }
    final int[] p = new int[sb.length()];
    for (int k = 0; k < sb.length(); ++k) {
      p[k] = sb.charAt(k) - '0';
    }
    return p;
  }

  @Override
  public Z next() {
    int[] p = makeDigits(++mN);
    long cnt = 0;
    final Permutation perm = new Permutation(p);
    CR sum = CR.ZERO;
    while ((p = perm.next()) != null) {
      sum = sum.add(CR.valueOf(Permutation.permToZ(p)).log());
      ++cnt;
    }
    return sum.divide(cnt).exp().floor();
  }
}

