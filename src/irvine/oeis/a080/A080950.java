package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080950 Number of numbers that differ from n in binary representation by exactly one edit-operation: deletion, insertion, or substitution.
 * @author Sean A. Irvine
 */
public class A080950 extends Sequence0 {

  private long mN = -1;

  private void add(final HashSet<Long> res, final String s) {
    if (s.length() <= 1 || s.charAt(0) != '0') {
      res.add(Long.parseLong(s, 2));
    }
  }

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    final HashSet<Long> res = new HashSet<>();
    // Deletions
    if (s.length() > 1) {
      for (int k = 0; k < s.length(); ++k) {
        add(res, s.substring(0, k) + s.substring(k + 1));
      }
    }
    // Insertions
    for (int k = 0; k <= s.length(); ++k) {
      for (int d = 0; d < 2; ++d) {
        add(res, s.substring(0, k) + d + s.substring(k));
      }
    }
    // Substitutions
    for (int k = 0; k < s.length(); ++k) {
      for (int d = 0; d < 2; ++d) {
        add(res, s.substring(0, k) + d + s.substring(k + 1));
      }
    }
    res.remove(mN);
    return Z.valueOf(res.size());
  }
}

