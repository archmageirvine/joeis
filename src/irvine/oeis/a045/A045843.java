package irvine.oeis.a045;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A045843 Number of distinct even numbers formed from the digits of n.
 * @author Sean A. Irvine
 */
public class A045843 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final int[] digits = new int[s.length()];
    for (int k = 0; k < s.length(); ++k) {
      digits[k] = s.charAt(k) - '0';
    }
    Arrays.sort(digits);
    final TreeSet<Long> seen = new TreeSet<>();
    final Permutation perm = new Permutation(digits);
    int[] p;
    while ((p = perm.next()) != null) {
      long t = 0;
      for (final int k : p) {
        t *= 10;
        t += k;
        if ((t & 1) == 0) {
          seen.add(t);
        }
      }
    }
    return Z.valueOf(seen.size());
  }
}

