package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A066411 Form a triangle with the numbers [0..n] on the base, where each number is the sum of the two below; a(n) is the number of different possible values for the apex.
 * @author Sean A. Irvine
 */
public class A066411 extends Sequence0 {

  private int mN = 0;

  private int apex(final int[] p) {
    if (p.length == 1) {
      return p[0];
    }
    if (p.length == 2) {
      return p[0] + p[1];
    }
    final int[] s = new int[p.length - 1];
    for (int k = 0; k < s.length; ++k) {
      s[k] = p[k] + p[k + 1];
    }
    return apex(s);
  }

  @Override
  public Z next() {
    final Permutation perm = new Permutation(++mN);
    final HashSet<Integer> seen = new HashSet<>();
    int[] p;
    while ((p = perm.next()) != null) {
      seen.add(apex(p));
    }
    return Z.valueOf(seen.size());
  }
}
