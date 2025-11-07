package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081732 Number of numbers that differ from n in ternary representation by exactly one edit-operation: deletion, insertion, or substitution.
 * @author Sean A. Irvine
 */
public class A081732 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toString(++mN, 3);
    final HashSet<Long> res = new HashSet<>();
    // Deletions
    if (s.length() > 1) {
      for (int k = 0; k < s.length(); ++k) {
        res.add(Long.parseLong(s.substring(0, k) + s.substring(k + 1)));
      }
    }
    // Insertions
    for (int k = 0; k <= s.length(); ++k) {
      for (int d = 0; d < 3; ++d) {
        res.add(Long.parseLong(s.substring(0, k) + d + s.substring(k)));
      }
    }
    // Substitutions
    for (int k = 0; k < s.length(); ++k) {
      for (int d = 0; d < 3; ++d) {
        res.add(Long.parseLong(s.substring(0, k) + d + s.substring(k + 1)));
      }
    }
    res.remove(mN);
    return Z.valueOf(res.size());
  }
}

